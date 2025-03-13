public class Tartaruga extends Mamiferos{

    @Override
    public void locomover(){
        System.out.println("Andando LENTAMENTE");
    }

    public Tartaruga(int idade, int membros, float peso, String corPelo) {
        super(idade, membros, peso, corPelo);
    }
}
