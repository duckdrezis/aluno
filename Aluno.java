import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno {
    Integer Codigo;
    String Nome;
    LocalDate dataNascimento;
    String telefone;
    String endereco;
    Map<String, List<Integer>> disciplinasnotas;
    Integer fase;
    String andamento;
    Integer numeroSala;
    Integer CPF;
    String sexo;
    double peso;
    String nomedisciplina;
    Integer notas;
    Integer mediaGeral;

    Map<String ,List<Integer>> getDisciplinasnotas;
    List<Boolean> frequencia = new ArrayList<>();

    public void imprimirDadosAlunos() {
        System.out.println("Codigo: " + Codigo + "\nNome: " + Nome + "\nData de nascimento: " + dataNascimento);
    }

    public void calcularmediaspormateria() {
        for (Map.Entry<String, List<Integer>> entry : disciplinasnotas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();
            System.out.println("Discilina: " + nomeDisciplina);
            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            System.out.println("Média: " + (somaNotas / notas.size()));

        }

    }

    public Integer mediaGeral() {
        mediaGeral = 0;
        for (Map.Entry<String, List<Integer>> entry : disciplinasnotas.entrySet()) {
            List<Integer> notas = entry.getValue();
            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            mediaGeral += somaNotas + notas.size();
            return mediaGeral / disciplinasnotas.size();

        }

        return null;
    }

    public Integer calcularFrequenciaAluno() {
        Integer totalPresencas = 0;
        for (Boolean presenca : frequencia) {
            if (presenca==(true)) {
                totalPresencas++;
            }
        }
        Integer totalAulas = frequencia.size();
        Integer frequenciafinal = (totalPresencas * 100) / totalAulas;
        return frequenciafinal;
    }
}