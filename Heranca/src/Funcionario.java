public class Funcionario extends Pessoa{

    //Atributos

    private String setor;
    private boolean trabalhando = false;

    public Funcionario(String nom, String sex, int ida) {
        super(nom, sex, ida);
    }

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
}
