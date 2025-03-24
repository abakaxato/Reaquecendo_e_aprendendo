public class Video implements acoesVideo{

    //Atributos

    private String titulo;
    private int views, curtidas,avaliacao;
    private boolean reproduzindo;

    //métodos

    @Override
    public void play() {

    }

    @Override
    public void like() {

    }

    @Override
    public void pause() {

    }

    //Getters and Setters

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //Construtor

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.avaliacao = 1;
        this.reproduzindo = false;
    }

    //TO String

    public void informacoes() {
        System.out.println("\n O Video : " + titulo + "\n tem " + views +" views\n " + curtidas + " curtidas \n " +  avaliacao + " avaliações \n " +
                " esta reproduzindo ? > " + reproduzindo);
    }
}
