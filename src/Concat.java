import java.util.Arrays;

public class Concat {
    public static void main(String[] args) {

        /**
         * Concatenare due Array di numeri
         */

        int[] arrayNumber1 = {1,2,3};
        int[] arrayNumber2 = {4,5,6};
        int[] concatArrayNumbers =
                Arrays.copyOf(arrayNumber1, arrayNumber1.length + arrayNumber2.length);

        System.arraycopy(arrayNumber2, 0, concatArrayNumbers, arrayNumber1.length, arrayNumber2.length);

        System.out.println(Arrays.toString(concatArrayNumbers));


        /**
         * Concatenare due Array di Stringhe
         */

        String[] arrayString1 = {"apple", "banana", "orange"};
        String[] arrayString2 = {"grape", "kiwi", "pineapple"};
        String[] concatArrayStrings =
                new String[arrayString1.length + arrayString2.length];
        // richiamare i due array da concatenare definendo la loro lunghezza con length NON SKIPPABILE

        System.arraycopy(arrayString1, 0, concatArrayStrings, 0, arrayString1.length);
        // Utilizzando un comando del System (arraycopy) si copia un Array partendo dall'Index desiderato (0)
        // così da copiare dall'inizio dell'Index, fino alla fine della sua lunghezza tramite il length
        System.arraycopy(arrayString2, 0, concatArrayStrings, arrayString1.length, arrayString2.length);
        // Stesso procedimento ma con il secondo ARRAY per poi specificare la completa copia di entrambi gli Array
        System.out.println(Arrays.toString(concatArrayStrings));
        // Qua c'è poco da dire, stampi
    }
}