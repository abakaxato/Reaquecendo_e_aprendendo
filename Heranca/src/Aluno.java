public class Aluno extends Pessoa {

    //Atributos

    private int matricula;
    private String curso;

    public Aluno(String nom, String sex, int ida) {
        super(nom, sex, ida);
    }

    // Métodos

    public void cancelarMatri(){
        this.matricula = 0;
        this.setCurso("Curso Cancelado ou inexistente");

    }


    //Getters and Setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
