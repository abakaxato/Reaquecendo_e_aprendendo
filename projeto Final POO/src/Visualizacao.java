public class Visualizacao {

    //Atributos
    private gafanhoto espectador;
    private Video filme;

    //Métodos
    public void avaliar(){

    }

    public void avaliar(int nota){

    }

    public void avaliar(float porcentagem){

    }


    //Getters abd Setters

    public gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //Contrutor
    public Visualizacao(gafanhoto espectador,Video filme){
        this.setEspectador(espectador);
        this.setFilme(filme);
    }

}

