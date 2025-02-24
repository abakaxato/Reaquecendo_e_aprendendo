public class Bolsista extends Aluno{

    //Atributos

    private int bolsa;

    //Métodos

    public void renovarBolsa(){
        System.out.println("Bolsa renovada");
    }

    public void pagarMensalidade(){
        System.out.println("mensalidade paga");
    }


    //Getters and Setters

    public int getBolsa() {
        return 0;
    }

    public void setBolsa(int b) {
        this.bolsa = b;
    }

    //Construtor

    public Bolsista(String nom, String sex, int ida, int mat, String curs) {
        super(nom, sex, ida, mat, curs);
    }
}
