public class MainPoli {
    public static void main (String [] args){

        Aves arara = new Aves(2,4,2.5f,"Azul");
        Mamiferos vaca = new Mamiferos(7,4,200f,"branca");
        Peixe baiacu = new Peixe(1,0,0.5f,"cinza");
        Reptil salamandra = new Reptil(3,5,2.5f,"vermelho");
        Cachorro lucarelli = new Cachorro(10,5,20f,"Marrom");
        Canguru jack = new Canguru(50,17,250f,"marrom escuro");

        lucarelli.reagir(5,8);


    }
}
