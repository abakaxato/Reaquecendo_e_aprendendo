import java.util.Objects;

public class Pessoa {

    //Atributos

    private String nome,sexo;
    private int idade;

    //Identificadores em List

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo, idade);
    }


    // Métodos

    public void fazerAni (){
        this.setIdade(+1);
    }

    public void apresentar() {
        System.out.println( "\nA Pessoa " + nome + ", do sexo " + sexo + ", tem " + idade + " anos de idade");
    }

    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Contrutor
    public Pessoa (String nom, String sex,int ida){
        this.setNome(nom);
        this.setSexo(sex);
        this.setIdade(ida);
    }
}
