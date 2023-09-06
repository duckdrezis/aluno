import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AlunoMain {
    public static void main (String[]args) {
        Aluno aluno01 = new Aluno();
        Map<String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();
        List<Boolean> frequenciaAluno01 = new ArrayList<>();

        frequenciaAluno01.add(false);
        frequenciaAluno01.add(false);
        frequenciaAluno01.add(true);
        frequenciaAluno01.add(true);
        frequenciaAluno01.add(true);

        aluno01.frequencia = frequenciaAluno01;
        aluno01.Codigo = 122334;
        aluno01.Nome = "Dr. Webber";
        aluno01.dataNascimento = LocalDate.of(1999, 12, 16);
        aluno01.endereco = "Rua Tal de Tal";
        aluno01.telefone = "48 9883379792";

        aluno01.fase = Integer.valueOf("3");
        aluno01.andamento = "Bom";
        aluno01.numeroSala = 72;
        aluno01.CPF = 0000045;
        aluno01.sexo = "Masculino";
        aluno01.peso = 65.9;


        notasMatematica.add(10);
        notasMatematica.add(9);
        notasPortugues.add(7);
        notasPortugues.add(6);

        disciplinas.put("Matematica", notasMatematica);
        disciplinas.put("Portugues", notasPortugues);

        aluno01.disciplinasnotas = disciplinas;
        aluno01.imprimirDadosAlunos();
        aluno01.calcularmediaspormateria();
        System.out.println("Aluno "+ aluno01.Nome +" possui a média " + aluno01.mediaGeral());
        Integer mediaGeralAlluno = aluno01.mediaGeral();
        Boletim boletim = new Boletim();
        String alunoaprovado =boletim.alunoaprovado(aluno01.Nome, mediaGeralAlluno,aluno01.calcularFrequenciaAluno());
        System.out.println(alunoaprovado);


    }
}