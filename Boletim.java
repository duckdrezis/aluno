public class Boletim {
    String aluno;

    public String alunoaprovado(String aluno, Integer MediaGeral, Integer frequencia) {

        if (frequencia < 70){
            return"Reprovado";
        }

        if (MediaGeral >= 7) {
            System.out.println("Aluno " + aluno + " foi  Aprovado ");
        } else if (MediaGeral >= 5) {
            System.out.println("Aluno " + aluno + "está em Recuperação");
        } else {
            System.out.println("Aluno " + aluno + " foi Reprovado");
        }
        return aluno;
    }

}