public class Aprendiz extends Humano{

    //Atributos

    private int matricula;
    private String curso;

    // Métodos
    public void pagarMensalidade(){
        System.out.println("mensalidade paga");
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
