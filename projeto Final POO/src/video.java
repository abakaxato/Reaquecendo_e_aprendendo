public class video implements acoesVideo{

    //Atributos

    private String avaliacao,titulo;
    private int views, curtidas;
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

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
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


}
