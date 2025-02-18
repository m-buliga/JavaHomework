package VariabilaMetoda;

public class Switch {
    /* switch(valoare) {
        case 'valoare1':
            // codul care se executa daca valoare == valoare1
            break;

        case 'valoare2':
            // codul care se executa daca valoare == valoare2
            break;

        case 'valoare2':
            // codul care se executa daca valoare == valoare3
            break;
            // break este necesar pentru a oprit executia ulterioara
    } */

    public static void afiseazaZiuaSaptamanii(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Ziua este Luni.");
                break;
            case 2:
                System.out.println("Ziua este Marti.");
                break;
            case 3:
                System.out.println("Ziua este Miercuri.");
                break;
            default:
                System.out.println("Ziua este invalida.");
        }

    }

    public static void main (String[] arg) {
        afiseazaZiuaSaptamanii(1);
    }
}
