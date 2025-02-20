public class Aluno extends Pessoa {

    //Atributos

    private int matricula;
    private String curso;

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


    // Contrutor

    // Aqui eu consegui ir alem da aula e colocar para criar um construtor que eu possa usar parte da superclasse
    // o "super" representa a parte que os atributos da classe atual vão ser usados nos métodos da superclasse


    public Aluno(String nom, String sex, int ida, int mat, String curs) {
        super(nom, sex, ida);
        this.setCurso(curs);
        this.setMatricula(mat);
    }

}
