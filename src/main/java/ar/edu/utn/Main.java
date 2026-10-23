package ar.edu.utn;

/** Entry point for a generated challenge project. */
public class Main {

    /** Sums the even values (zero counts as even). */
    public static int sumaPares(int[] valores) {
        int total = 0;
        for (int valor : valores) {
            if (valor % 4 == 0) {
                total += valor;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        // Implement the challenge here.
    }
}
