package UFC;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutadores desafiado, desafiante;
    private int rouds;
    private boolean aprovada = true;

    public void marcarLuta(Lutadores l1,Lutadores l2){

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
