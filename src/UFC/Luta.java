package UFC;

import java.util.Random;

public class Luta {
    private Lutadores desafiado, desafiante;
    private int rouds;
    private boolean aprovada;

    public void marcarLuta(Lutadores l1,l2){

        //regras da luta
        if (l1.getCategoria()!=l2.getCategoria()){
            System.out.println("Categorias incompativeis para a realização da luta");
        } else if (l1.getNome()==l2.getNome()) {
            System.out.println("Lutador cadastrado como desafiante e desafiado");
        }else if (aprovada == false){
            System.out.println("Luta não aprovada");
        }else {
            desafiado = l1;
            desafiante = l2;
        }
    }

    public void lutar(){
        if(aprovada == true){
            desafiado.apresentar();
            desafiante.apresentar();
            Random vencedor = new Random(2);










        }else{
            System.out.println("Luta não aprovada");
        }
    }

    public void setDesafiado(Lutadores dd){
        this.desafiado = dd;
    }
    public Lutadores getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutadores df){
        this.desafiante = df;
    }

    public Lutadores getDesafiante(){
        return this.desafiante;
    }
}
