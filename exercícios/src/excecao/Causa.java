package excecao;

public class Causa {
    public static void main(String[] args) {
        metodoA(null);
    }

    static void metodoA (Aluno aluno) {
        metodoB(aluno);
    }
    
    static void metodoB (Aluno aluno) {
        if(aluno == null) {
            throw new NullPointerException("aluno is null");
        }
        System.out.println(aluno.nome);
    }

}
