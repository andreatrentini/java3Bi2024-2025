package Vettori;

public class Testo {
    public static void main(String[] args) {
        // Esercizi:
        // 1. Calcolo delle frequenze dei caratteri nel testo
        // 2. Conteggio delle parole e visualizzazione della lunghezza media
        // 3. Eliminazione di caratteri di punteggiatura
        // 4. Invertite la stringa
        // 5. Calcolare la somma delle vocali e delle consonanti
        // 6. Per ogni carattere dell'alfabeto visualizzare i 3 caratteri che più spesso appaiono come successivi
        // 7. Determinare se la stringa è palindroma

        String text1 = "I topi non avevano nipoti".toUpperCase();
        int[] frequenze = new int[26];

        // 1. Calcolo frequenze, versione 1

        System.out.println("Calcolo frequenze caratteri versione 1");
        
        for (int i = 0; i < text1.length(); i++) {
            if(text1.charAt(i) >= 'A' && text1.charAt(i) <= 'Z') {
                frequenze[text1.charAt(i) - 65]++;
            }
        }
        
        for (int i = 0; i < frequenze.length; i++) {
            System.out.println((char)(i + 65) + ": " + frequenze[i]);
        }
        
        // 1. Calcolo frequenze, versione 2
        
        System.out.println("Calcolo frequenze caratteri versione 2");
        frequenze = new int[26];        
        char[] charText = text1.toCharArray();
        
        for (int i = 0; i < charText.length; i++) {
            if(charText[i] >= 'A' && charText[i] <= 'Z') {
                frequenze[charText[i] - 65]++;
            }
        }
        
        for (int i = 0; i < frequenze.length; i++) {
            System.out.println((char)(i + 65) + ": " + frequenze[i]);
        }
        
    }
}
