public class Visualizacao {

    //Atributos
    private gafanhoto espectador;
    private Video filme;

    //Métodos
    public void avaliar(){
        System.out.println("Filme não avaliado");
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem){
        int tot =0;
       if(porcentagem<=20){tot=1;}
       else if (porcentagem<= 50){tot=2;}
       else if (porcentagem<= 70){tot=3;}
       else if (porcentagem<= 80){tot=4;}
       else if (porcentagem<= 90){tot=5;}
       this.filme.setAvaliacao(tot);
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

    /*Aqui ta o pulo do gato, para conseguir fazer as duas classes "Conversarem" é preciso uma terceira classe
    e gerar uma instancia de cada classe para poder manusear elas*/

    public Visualizacao(gafanhoto espectador,Video filme){
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);

    }

    // To String

    @Override
    public String toString() {
        return "Visualizacao : \n" + espectador +"\n"+ filme;
    }
}

