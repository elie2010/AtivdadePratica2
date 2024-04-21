import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Aluno>listaAlunos = new ArrayList<>();

    public static void cadastar (Aluno alun) {
        listaAlunos.add(alun);
    }

    public static List<Aluno> getlistaAlunos () {
        return listaAlunos;
    }

    public static List<Aluno> getProfessor () {
        List<Aluno> tempList = new ArrayList<>();
        for (Aluno tempAlun : listaAlunos){
            if (tempAlun instanceof Professor){
                tempList.add(tempAlun);
            }
        }
        return tempList;
    }

    public static boolean excluir (int matricula) {

        for (Aluno tempAluno : listaAlunos){
            if (tempAluno.getMatricula() == matricula){
                listaAlunos.remove(tempAluno);
                return true;
            }
        }
        return false;
    }

    public static boolean excluirLista () {

        listaAlunos.clear();
        return true;
    }






}
