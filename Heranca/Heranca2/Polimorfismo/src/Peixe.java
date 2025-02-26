public class Peixe extends Animal{

    //Atributos
    private String corEscama;

    //Métodos
    public void soltarBolhas(){
        System.out.println("blublublu");
    }

    // Getters and setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //Métodos da Super Classe (Obrigatórios e obrigatorios sobrepor)
    @Override
    public void locomover() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public String emitirSom() {
        return "..........";
    }
}
