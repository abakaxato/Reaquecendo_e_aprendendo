public class Aves extends Animal{
    //Atributos
    private String corPena;

    //Métodos
    public void fazerNinho(){
        System.out.println("ninho feito");
    }

    // Getters and setters
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //Métodos da Super Classe (Obrigatórios e obrigatorios sobrepor)
    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ingerindo");
    }

    @Override
    public String emitirSom() {
        return "ara ara ara";
    }
}
