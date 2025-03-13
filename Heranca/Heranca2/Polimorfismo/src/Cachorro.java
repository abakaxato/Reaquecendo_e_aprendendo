public class Cachorro extends Mamiferos{

    public void enterrarOsso(){
        System.out.println("osso enterrado");
    }

    public void abanarRabo(){
        System.out.println("Rabo abanando....");
    }


    public Cachorro(int idade, int membros, float peso, String corPelo) {
        super(idade, membros, peso, corPelo);
    }
}
