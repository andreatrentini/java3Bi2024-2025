package Vettori;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTesto {
    public static void main(String[] args) {
        String filename = "/workspaces/java3Bi2024-2025/Vettori/testo.txt";
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            int nrRighe = 0;
            int nrCaratteri = 0;
            int nrParole = 0;
            String riga;
            while ((riga = br.readLine()) != null) {
                nrRighe++;
                nrCaratteri += riga.length();                              
                String rigaMaiuscolo = riga.toUpperCase();
                String parola = "";
                for (int i = 0; i < rigaMaiuscolo.length(); i++) {
                    char carattere = rigaMaiuscolo.charAt(i);
                    if(carattere >= 'A' && carattere <= 'Z') {
                        parola += carattere;
                    }
                    else {
                        if (parola.length() > 0) {
                            nrParole++;
                            parola = "";
                        }
                    }                                       
                }
                
                System.out.println(riga);
            }
            // Scrivo i risultati in un file

            String writeFileName = "/workspaces/java3Bi2024-2025/Vettori/risultati.txt";

            FileWriter fw = new FileWriter(writeFileName);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Risultati analisi del file: " + filename);
            bw.newLine();
            bw.newLine();
            bw.write("Numero di righe:" + nrRighe);
            bw.newLine();
            bw.write("Numero di caratteri:" + nrCaratteri);
            bw.newLine();
            bw.write("Numero di parole:" + nrParole);

            System.out.println("Numero di righe:" + nrRighe);
            System.out.println("Numero di caratteri:" + nrCaratteri);
            System.out.println("Numero di parole:" + nrParole);
            br.close();
            bw.close();
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
