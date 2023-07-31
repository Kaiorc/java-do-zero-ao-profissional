package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    Pessoa(String nome, String sobrenome, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        int novaIdade = Math.abs(idade);

        if (novaIdade > 0 && novaIdade < 150) {
            this.idade = novaIdade;
        }
    }

    public String toString() {
        return "Eu sou " + getNomeCompleto() + " e tenho " + getIdade() + " anos";
    }
}
