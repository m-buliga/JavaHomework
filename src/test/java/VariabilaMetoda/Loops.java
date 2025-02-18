package VariabilaMetoda;

public class Loops {

    /* for (init; condition; increment) {
        // codul care se executa
    } */

    public static void main (String[] args) {
        //afiseazaNumere();
        printeazaNumerelePare();
    }

    public static void afiseazaNumere() {
        for (int contor = 1; contor <= 10; contor ++) {
            System.out.println("Contor: " + contor);
        }
    }


    public static void printeazaNumerelePare() {
        int contor = 2;
        while (contor <= 10) {
            if (contor % 2 == 0) {
                System.out.println("Contor: " + contor);
            }
            contor ++;
        }
    }
}
