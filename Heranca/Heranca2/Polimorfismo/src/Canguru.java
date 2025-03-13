public class Canguru extends Mamiferos{

    public void usarbolsa(){
        System.out.println("usando a bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("pula pula");
    }


    public Canguru(int idade, int membros, float peso, String corPelo) {
        super(idade, membros, peso, corPelo);
    }
}
