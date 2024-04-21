public class Gerente extends Aluno {

    private String projetoAtual;

    public Gerente() {
    }

    public Gerente(String projetoAtual) {
        this.projetoAtual = projetoAtual;
    }

    public Gerente(String nome, String email, int matricula, String projetoAtual) {
        super(nome, email, matricula);
        this.projetoAtual = projetoAtual;
    }

    public String getProjetoAtual() {
        return projetoAtual;
    }

    public void setProjetoAtual(String projetoAtual) {
        this.projetoAtual = projetoAtual;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        "\nProjeto Atual:" + projetoAtual;
    }
    









}
