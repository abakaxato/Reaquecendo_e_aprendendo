public class Mamiferos extends Animal{

    //Atributos
    private String corPelo;

    // Getters and setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Métodos da Super Classe (Obrigatórios e obrigatorios sobrepor)
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public String emitirSom() {
        return " au au ";
    }
}
