package UFC;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutadores desafiado, desafiante;
    private int rouds;
    private boolean aprovada = true;

    // Métodos especiais

    public void marcarLuta(Lutadores l1,Lutadores l2){

        // o uso de equals é recomendado para comparação de objetos ou classes que no caso abaixo são String

        /*ao colocar "!" anteriormente a uma condição ou Boolean, é validado se o contrario daquela condição acontece
         No caso atual utilizei no "!aprovada" e também poderia ter utilizado no teste de equals*/

        if (!Objects.equals(l1.getCategoria(), l2.getCategoria())){
            System.out.println("Categorias incompativeis para a realização da luta");
            System.exit(0);
        } else if (Objects.equals(l1.getNome(), l2.getNome())) {
            System.out.println("Lutador cadastrado como desafiante e desafiado");
            System.exit(0);
        }else if (!aprovada){
            System.out.println("Luta não aprovada");
            System.exit(0);
        }else {
            desafiado = l1;
            desafiante = l2;
        }
    }

    public void lutar(){
        if(aprovada){
            desafiado.apresentar();

            desafiante.apresentar();

            /*  O vencedor é decidido de forma aleátoria com uma varíavel do tipo Random, Classe vinda do pacote de
            utilidades do java "Java.util.Random"  */

            Random v = new Random();
            int vencedor = v.nextInt(3);   //conta a partir do 0

                switch (vencedor){
                    case 1:
                        System.out.println("o vencedor foi o desafiante " + desafiante.getNome()) ;
                        desafiante.ganharLuta();
                        desafiado.perderLuta();
                        break;
                    case 2:
                        System.out.println("o vencedor foi o desafiado " + desafiado.getNome());
                        desafiante.perderLuta();
                        desafiado.ganharLuta();
                        break;
                    case 0:
                        System.out.println("a luta terminou em empate");
                        desafiado.empatarLuta();
                        desafiante.empatarLuta();
                }

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
