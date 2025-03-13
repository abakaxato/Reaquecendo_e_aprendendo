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
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Sugando");
    }

    @Override
    public String emitirSom() {
        return "..........";
    }

    //Construtor
    public Peixe(int idade, int membros,float peso, String corEscama){
        this.setIdade(idade);
        this.setMembros(membros);
        this.setPeso(peso);
        this.setCorEscama(corEscama);

    }

}
