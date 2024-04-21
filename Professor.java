public class Professor extends Aluno {

    private String materiaAplicada;

    public Professor () {
    }

    public Professor(String materiaAplicada) {
        this.materiaAplicada = materiaAplicada;
    }

    public Professor(String nome, String email, int matricula, String materiaAplicada) {
        super(nome, email, matricula);
        this.materiaAplicada = materiaAplicada;
    }

    public String getMateriaAplicada() {
        return materiaAplicada;
    }

    public void setMateriaAplicada(String materiaAplicada) {
        this.materiaAplicada = materiaAplicada;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        "\nMatéria Aplicada:" + materiaAplicada ;
    }





}
