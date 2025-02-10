package UFC;

public class Lutadores {
    private String nome, nacionalidade, categoria;
    private Integer idade, vitorias, derrotas, empates;
    private Float altura, peso;


    //Metodos

    public void apresentar(){
        System.out.println("boa tarde, boa noite e bom dia a todos presentes, quem voz fala é o apresentador abaka");
        System.out.println("aqui diante de todos temos os lutadores " + this.nome + "e " + this.nome);

    }
    public void status(){

    }
    public void ganharLuta(){

    }

    public void perderLuta(){

    }

    public void empatarLuta(){

    }



    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Lutadores(String nom, String cat, int ida, float alt, float pes, int vit, int der, int emp) {
        this.setNome(nom);
        this.setNacionalidade(cat);
        this.setIdade(ida);
        this.setAltura(alt);
        this.setPeso(pes);
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(emp);
}
}
