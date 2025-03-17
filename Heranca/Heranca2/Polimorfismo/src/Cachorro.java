public class Cachorro extends Lobo{


    //Metodos
    @Override
    public String emitirSom(){
        return "au au au";
    }


    public void reagir(String frase){

    }

    public void reagir(int hora ,int min){

    }

    public void reagir (boolean dono){

    }

    public void reagir (int idade, float peso){

    }

    public void enterrarOsso(){
        System.out.println("osso enterrado");
    }

    public void abanarRabo(){
        System.out.println("Rabo abanando....");
    }

    //Construtor
    public Cachorro(int idade, int membros, float peso, String corPelo) {
        super(idade,membros,peso,corPelo);
    }
}
