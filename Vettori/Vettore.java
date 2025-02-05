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

        // Ricerca di un elemento: restituisco la prima posizione

        // 1. Dichiaro la variabile per l'elemento da cercare
        int elementoDaCercare;

        // 2. Acquisisco la variabile da tastiera
        System.out.print("Inserire il numero da cercare: ");

        Scanner tastiera = new Scanner(System.in);
        elementoDaCercare = tastiera.nextInt();

        // Prima di iniziare la ricerca l'elemento non è stato ovviamente trovato
        boolean trovato = false;
        int indice = 0;

        // Continuo a cercare l'elemento da trovare mentre non l'ho trovato e non ho esaminato tutti gli elementi
        while (!trovato && indice < vettore.length) {
            // Confronto l'elemento del vettore corrente con il valore da cercare
            if (elementoDaCercare == vettore[indice])
            {
                // Bingo!!! l'ho trovato
                trovato = true;
            }
            else {
                indice++;
            }
        }

        if (trovato) {
            System.out.println("Elemento trovato in posizione: " + indice);
        }
        else {
            System.out.println("Elemento non trovato.");
        }

        // Cerco l'elemento e restituisco tutte le posizioni in cui si trova

        // Creo un array con la stessa dimensione di vettore (mi serve se per caso tutti gli elementi sono uguali
        // all'elemento da cercare, raro ma possibile...)
        int posizioni[] = new int[vettore.length];
        int nrPosizioniTrovate = 0;

        // Analizzo tutti gli elementi del vettore
        for (int i = 0; i < vettore.length; i++) {
            if (elementoDaCercare == vettore[i]) {
                // Devo salvare la posizione
                // Memorizzo la posizione 
                posizioni[nrPosizioniTrovate] = i;
                // Incremento il numero di posizioni trovate
                nrPosizioniTrovate++;
            }
        }

        // Chi mi dice quanto volte è presente il numero da cercare?

        System.out.println(elementoDaCercare + " è stato trovato " + nrPosizioniTrovate + " volte.");
        System.out.println("Posizioni:");

        // Visualizzo a video tutte le posizioni
        for (int i = 0; i < nrPosizioniTrovate; i++) {
            System.out.print(posizioni[i] + ", ");
        }

        // Ordinamenti

        // 1. selection sort
        // Confronto ogni elemento con tutti i successivi, effettuo lo scambio se il primo è maggiore del secondo
        // se si vuole ottenere un ordinamento crescente

        // Prendo ogni elemento
        for (int i = 0; i < vettore.length - 1; i++) {
            // Lo confronto con tutti i successivi
            for (int j = i + 1; j < vettore.length; j++) {
                // Confronto i due elementi
                if (vettore[i] > vettore[j]) {
                    // Devo fare lo scambio: è necessario avere una ulteriore variabile
                    int scambio = vettore[i];
                    vettore[i] = vettore[j];
                    vettore[j] = scambio;
                }
            }
        }


        

    }
}