public abstract class Animal {

    //Atributos
    protected int idade, membros;
    protected float peso;

    //Métodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract String emitirSom();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
