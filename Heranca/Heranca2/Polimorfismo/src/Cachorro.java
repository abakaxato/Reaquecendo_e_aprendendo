import java.util.Objects;

public class Cachorro extends Lobo{


    //Metodos
    @Override
    public String emitirSom(){
        return "au au au";
    }


    public void reagir(String frase){
        if (Objects.equals(frase, "Agradavel")) {
            System.out.println("abanando o rabo");
        }else{
            System.out.println("Rosnando");
        }

    }

    public void reagir(int hora ,int min){
        if (hora<12){
            System.out.println("Abanando o rabo");
        } else if (hora>=18) {
            System.out.println("Ignorando");
        }else{
            System.out.println("abanando e latindo");
        }
    }

    public void reagir (boolean dono){
        if(dono){
            abanarRabo();
        }else{
            System.out.println("Rosnando");
        }
    }

    public void reagir (){
        if(this.getIdade()<5){
            if (this.getPeso()<10){
                abanarRabo();
            }else{
                System.out.println("Latindo");
            }
        }else{
            if (this.getPeso()>10){
                System.out.println("Rosnando");
            }else{
                System.out.println("Ignorando");
            }
        }
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
