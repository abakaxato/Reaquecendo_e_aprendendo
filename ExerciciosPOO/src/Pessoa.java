public class Pessoa {
    private int idade;
    private String sexo, nome;

    //Métodos

    public void fazerAniver(){
    }

    // Contrutor

    public Pessoa(String sex,int id, String nom){
        this.setSexo(sex);
        this.setIdade(id);
        this.setNome(nom);
    };

    //getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
