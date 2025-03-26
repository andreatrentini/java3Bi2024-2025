public class Ricorsione {

    public static int fattoriale(int numero) {
        if (numero <= 1) {
            return 1;
        }
        else {
            return numero * fattoriale(numero - 1);
        }
    }

    public static int fibonacci(int numero) {
        if (numero == 0) {
            return 0;
        }
        if (numero == 1) {
            return 1;
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}
