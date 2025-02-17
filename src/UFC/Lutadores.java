package UFC;

public class Lutadores {
    private String nome, nacionalidade, categoria;
    private Integer idade, vitorias, derrotas, empates;
    private Float altura, peso;


    //Metodos

    public void apresentar(){
        System.out.println("boa tarde, boa noite e bom dia a todos presentes, quem voz fala é o apresentador abaka");
        System.out.println("aqui diante de todos temos o estimado lutador " + this.getNome()+ ", peso "+ getCategoria());
        System.out.println("pesando exatamente " + this.getPeso() +"Kg"+" e vindo diretamente de " + this.getNacionalidade());
        System.out.println("com "+this.getIdade()+ " aninhos e " + getAltura() + " de altura");
        System.out.println("\nGanhou " + this.getVitorias()+"x\nperdeu "+getDerrotas()+"x\natualmente conta com "+getEmpates()+" Empates\n");

    }
    public void status(){
        System.out.println(this.getNome()+" é um peso "+ getCategoria()+"\n"+getVitorias()+" Vitorias\n"+getDerrotas()+" Derrotas\n"+getEmpates()+" Empates");

    }
    public void ganharLuta(){
        this.setVitorias(+1);
    }

    public void perderLuta(){
        this.setDerrotas(+1);
    }

    public void empatarLuta(){
        this.setEmpates(+1);
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

    private void setCategoria(String categoria) {
        if (this.getPeso()<=52){
             this.categoria = ("invalido, Muito maguinho");
           }else if (this.getPeso()<=70){
             this.categoria = ("Leve");
           } else if (this.getPeso()<80) {
            this.categoria = ("Média");
           } else if (this.getPeso()<=120) {
            this.categoria = ("Pesado");
           }else if (this.getPeso()>120){
            this.categoria = ("invalido, muito gordinho");
           }else{this.categoria="invalido";

        }

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
        this.setCategoria(null);
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



    //Constructor

    public Lutadores(String nom, String nac, int ida, float alt, float pes, int vit, int der, int emp) {
        this.setNome(nom);
        this.setNacionalidade(nac);
        this.setIdade(ida);
        this.setAltura(alt);
        this.setPeso(pes);
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(emp);
}
}
