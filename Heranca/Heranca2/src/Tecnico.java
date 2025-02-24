public class Tecnico extends Aluno{

    //Atributos
    private int registroProf;

    //Métodos

    public void Praticar(){
        System.out.println("O aluno tecnico praticou");
    }

    //Getters and Setters

    public int getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }

//Construtor

    public Tecnico(String nom, String sex, int ida, int mat, String curs, int reg) {
        super(nom, sex, ida, mat, curs);
        this.setRegistroProf(reg);
    }
}
