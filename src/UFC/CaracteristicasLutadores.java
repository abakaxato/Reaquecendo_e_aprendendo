package UFC;

import java.util.Random;

public class CaracteristicasLutadores {

        public static void main (String [] args) {
            int dd,dt;

            Lutadores[] l = new Lutadores[7];
            l[0] = new Lutadores("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
            l[1] = new Lutadores("Putscript" , "Brasil", 29, 1.68f, 49.8f, 14, 2, 3);
            l[2] = new Lutadores("SnapShadow", "EUA"  , 35, 1.65f, 80.9f, 12, 2, 1);
            l[3] = new Lutadores("Dead Code","Australia", 28, 1.93f, 81.6f, 13, 0, 2);
            l[4] = new Lutadores("Ufo Cobol" , "Brasil" , 37, 1.70f, 119.3f, 5, 4, 3);
            l[5] = new Lutadores("Nerdaard" , "EUA"     , 30, 1.81f, 105.7f,12, 2, 4);
            l[6] = new Lutadores("mamae", "groelandia", 90, 2.00f, 250.0f, 40, 0, 1);

            //Instaciando a classe luta e criando a varíavel de lutador aleátorio

            Luta luta = new Luta();

            Random i = new Random();
            dd = i.nextInt(7);
            dt= i.nextInt(7);

            luta.marcarLuta(l[dd],l[dt]);

            luta.lutar();

        }

    }
