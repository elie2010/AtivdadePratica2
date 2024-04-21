public class Coordenador extends Aluno {

    private String projetoFuturo;

    public Coordenador (){
    }

    public Coordenador(String projetoFuturo) {
        this.projetoFuturo = projetoFuturo;
    }

    public Coordenador(String nome, String email, int matricula, String projetoFuturo) {
        super(nome, email, matricula);
        this.projetoFuturo = projetoFuturo;
    }

    public String getProjetoFuturo() {
        return projetoFuturo;
    }

    public void setProjetoFuturo(String projetoFuturo) {
        this.projetoFuturo = projetoFuturo;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        "\nProjeto Futuro:" + projetoFuturo;
    }





    }

    





