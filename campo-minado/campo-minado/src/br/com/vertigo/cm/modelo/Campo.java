package br.com.vertigo.cm.modelo;
import java.util.ArrayList;
import java.util.List;

import br.com.vertigo.cm.excecao.ExplosaoException;

public class Campo {
    
    private final int linha;
    private final int coluna;

    private boolean aberto;
    private boolean minado;
    private boolean marcado;

    //Lista de campos vizinhos associado a um campo
    private List<Campo> vizinhos = new ArrayList<Campo>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    /*Verifica se a condi��o de vizinho � cumprida. Vizinhos t�m a 
    dist�ncia = 1(horizontal e vertical) ou 2 (diagonal)*/ 
    boolean adicionarVizinho(Campo possivelVizinho) {
        //Verifica se est�o na mesma linha, coluna ou diagonal
        boolean linhaDiferente = linha != possivelVizinho.linha;
        boolean colunaDiferente = coluna != possivelVizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        //Calcula o valor absoluto da dist�ncia entre os campos
        int deltaLinha = Math.abs(linha - possivelVizinho.linha);
        int deltaColuna = Math.abs(coluna - possivelVizinho.coluna);
        int deltaGeral = deltaLinha + deltaColuna;
        
        //Verifica as condi��es e adiciona na lista
        if (deltaGeral == 1 && !diagonal) {
            vizinhos.add(possivelVizinho);
            return true;
        } else if (deltaGeral == 2 && diagonal) {
            vizinhos.add(possivelVizinho);           
            return true;
        } else{
            return false;
        }
    }

    /*Verifica se o campo n�o est� aberto*/ 
    void alternarMarcacao() {
        //Alterna a marca��o, se estiver V, retona F
        //e se estiver F, retorna V
        if(!aberto){
            marcado = !marcado;
        }
    }

    /*Verifica se o campo pode ser aberto, se sim, o abre e verifica se est� minado e se
    a vizinhan�a � segura para poder continuar abrindo os campos seguros*/
    boolean abrir(){
        //Verifica se o campo est� n�o aberto e n�o marcado
        if (!aberto && !marcado){
            //Abriu o campo
            aberto = true;
            //Se o campo est� minado, lan�a a exce��o de explos�o
            if (minado) {
                throw new ExplosaoException();
            }
            //Se a vizinhan�a for segura, abre os campos at� encontrar um campo n�o seguro 
            if(vizinhancaSegura()){
                vizinhos.forEach(v -> v.abrir());
            }
            //Confirma que o campo foi aberto
            return true;
        } else {
            //O campo n�o foi aberto
            return false;
        }
    }

    /*Verifica se a vizinhan�a � segura*/
    boolean vizinhancaSegura(){
        return vizinhos.stream().noneMatch(v -> v.minado);
    }


    void minar(){
        minado = true;
    }

    public boolean isMarcado(){
        return marcado;
    }

    public boolean isAberto(){
        return aberto;
    }

    public boolean isFechado(){
        return !isAberto();
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    /*Objetivo alcan�ado em um campo*/
    boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }

    /*Mostra a quantidade de minas na vizinhan�a*/
    long minasNaVizinhanca(){
        //Percorre o array de vizinhos e retorna o n�mero de campos minados
        return vizinhos.stream().filter(v -> v.minado).count();
    }

    /*Zera os atributos boolean do campo*/
    void reiniciar(){
        aberto = false;
        minado = false;
        marcado = false;
    }

    public String toString(){
        if(marcado){
            return "x";
        } else if(aberto && minado){
            return "*";
        } else if(aberto && minasNaVizinhanca() > 0){
            return Long.toString(minasNaVizinhanca());
        } else if(aberto){
            return " ";
        } else{
            return "?";
        }
    }
}
