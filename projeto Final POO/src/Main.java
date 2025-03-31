public class Main {
    public static void main(String[] args) {

        Video v [] = new Video[3];
        v [0]= new Video("POO");
        v [1]= new Video("Laços");
        v [2]= new Video("Variaveis");


        gafanhoto p [] = new gafanhoto[2];
        p[0] = new gafanhoto("joão","homi",12,"jogao@gmail.com");
        p[1] = new gafanhoto("maria","mule",12,"maquina@gmail.com");

        Visualizacao vis []= new Visualizacao[2];
        vis [0] = new Visualizacao(p[0],v[0]);
        vis [1] = new Visualizacao(p[0],v[1]);

        System.out.println(vis[1].toString());
        vis[1].avaliar(80f);
        System.out.println(v[1].toString());

    }

}