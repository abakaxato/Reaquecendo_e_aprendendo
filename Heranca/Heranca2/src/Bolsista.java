public class Bolsista extends Aluno{

    //Atributos

    private int bolsa;

    //Métodos

    public void renovarBolsa(){
        System.out.println("Bolsa renovada");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("mensalidade do aluno bolsista paga");
    }


    //Getters and Setters

    public int getBolsa() {
        return 0;
    }

    public void setBolsa(int b) {
        this.bolsa = b;
    }

    //Construtor

    public Bolsista(String nom, String sex, int ida, int mat, String curs,int bo) {
        super(nom, sex, ida, mat, curs);
        this.setBolsa(bo);
    }
}
