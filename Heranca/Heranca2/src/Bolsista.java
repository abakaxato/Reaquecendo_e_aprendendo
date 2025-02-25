public class Bolsista extends Aprendiz{

    //Atributos

    private int bolsa;

    //Métodos

    public void renovarBolsa(){
        System.out.println("bolsa renovada");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("mensalidade do bolsista paga");
    }
    //Getters and Setters

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
