public class gafanhoto extends Pessoa{

    //Atributos
    private String login;
    private int totAssistido;

    //Métodos

    public void assistirMaisUm(){
        this.setTotAssistido(+1);
    }

    //Getters and Setters

    public String isLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    //Construtor

    public gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
    }

    //To string

    public void informacoes(){
        System.out.println(this.getNome() + " faz parte da nossa familia de gafanhotos, tem " +
        this.getIdade() +" Anos de idade e é " +
        this.getSexo() + ", Atualmente conta com " +
        this.getExperiencia()+ " Pontos de experiencia");
    }
}
