public class Tecnico extends Aluno{

    //Atributos
    private int registroProf;

    //Métodos

    public void Praticar(){
        System.out.println("O aluno tecnico praticou");
    }


    //Construtor

    public Tecnico(String nom, String sex, int ida, int mat, String curs) {
        super(nom, sex, ida, mat, curs);
    }
}
