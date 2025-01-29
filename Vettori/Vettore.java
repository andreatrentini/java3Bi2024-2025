package Vettori;

import java.util.Random;
import java.util.Scanner;

public class Vettore {

    public static void main(String[] args) {
        // Dichiarazione
        // vettore è una varibile di tipo riferimento, il suo valore reale è l'indirizzo
        // di memoria (RAM)
        // al quale possiamo trovare il primo elemento del vettore
        int vettore[];
        int nr_elementi = 1000;

        // Allocazione della memoria: chiedo al sistema operativo lo spazio in RAM
        // per memorizzare gli elementi del vettore

        vettore = new int[1000];

        // Inserimento di dati in un vettore
        // 1° modo: inserisco tutti i dati in un unica fase

        // Definire un generatore di numeri casuali
        Random generatore = new Random();

        // Inserire i dati nel vettore: 1 alla volta in un ciclo for
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = generatore.nextInt(-100, 100);
        }

        // Calcolo della somma di tutti gli elementi
        // Definire un accumulatore e inizializzarlo a 0
        int somma = 0;
        for (int i = 0; i < vettore.length; i++) {
            somma += vettore[i];
        }

        // Calcolo della media
        double media;
        // Cast esplicito
        media = (double)somma / vettore.length;

        // Somma dei pari e somma dei dispari
        // Approccio è sempre uguale: ciclo for elemento per elemento, con una novità, eseguo controlli nel ciclo
        int sommaPari = 0, sommaDispari = 0;

        for (int i = 0; i < vettore.length; i++) {
            if (vettore[i] % 2 == 0) {
                // l'elemento del vettore è pari
                sommaPari += vettore[i];
            }
            else {
                sommaDispari += vettore[i];
            }
        }

        // Ricerca di un elemento
        // 1. Dichiaro la variabile per l'elemento da cercare
        int elementoDaCercare = 7;

        // 2. Acquisisco la variabile da tastiera
        Scanner tastiera = new Scanner(System.in);
        elementoDaCercare = tastiera.nextInt();

        

    }
}