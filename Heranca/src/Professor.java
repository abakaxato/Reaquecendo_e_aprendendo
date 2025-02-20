public class Professor extends Pessoa{

    //Atributos
    private String especialidade;
    private float salario;

    // Métodos

    public void receberAume(int a){
        this.setSalario(this.getSalario() + a);
    }

    // Getters and Setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Contrutor

    // Aqui eu consegui ir alem da aula e colocar para criar um construtor que eu possa usar parte da superclasse
    // o "super" representa a parte que os atributos da classe atual vão ser usados nos métodos da superclasse

    public Professor(String nom, String sex, int ida, String espe,float sal) {
        super(nom, sex, ida);
        this.setSalario(sal);
        this.setEspecialidade(espe);
    }


}
