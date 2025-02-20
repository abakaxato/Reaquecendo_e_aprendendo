public class Funcionario extends Pessoa{

    //Atributos

    private String setor;
    private boolean trabalhando = false;

    // Métodos

    public void mudartraba(String s){
        if (trabalhando){
            this.setSetor(s);
        }else {
            this.setTrabalhando(true);
            System.out.println("Funcionario não estava trabalhando, adicionando trabalho...");
        }
    }

    // Getters and Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }


    // Contrutor

    // Aqui eu consegui ir alem da aula e colocar para criar um construtor que eu possa usar parte da superclasse
    // o "super" representa a parte que os atributos da classe atual vão ser usados nos métodos da superclasse

    public Funcionario(String nom, String sex, int ida, String seto,boolean trab) {
        super(nom, sex, ida);
        this.setSetor(seto);
        this.setTrabalhando(trab);
    }

}
