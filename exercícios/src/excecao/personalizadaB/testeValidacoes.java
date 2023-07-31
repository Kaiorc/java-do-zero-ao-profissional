package excecao.personalizadaB;

import excecao.Aluno;

public class testeValidacoes {
    public static void main(String[] args) {
        
        try {
            Aluno aluno = new Aluno("Ana", -7);
            Validar.aluno(aluno);
            
        } catch (StringVaziaException e){
            System.out.println(e.getMessage());
        }catch (NumeroForaDoIntervaloException e){
            System.out.println(e.getMessage());
        }
        
        Validar.aluno(null);

        System.out.println("Fim.");
    }
}
