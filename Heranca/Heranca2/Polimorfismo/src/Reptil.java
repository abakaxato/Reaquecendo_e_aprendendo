public class Reptil extends Animal{

    //Atributos
    private String corEscama;

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
        System.out.println("Arrastando");
    }

    @Override
    public void alimentar() {
        System.out.println("Rasgando");
    }

    @Override
    public String emitirSom() {
        return " siiii";
    }
}
