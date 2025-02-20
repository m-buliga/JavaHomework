package Homework;

import java.util.HashMap;
import java.util.Map;

public class MapsExercises {

    public static void main (String[] args) {

        HashMap<String, String> studenti = new HashMap<>();

        // adaug elemente cu metoda .put()
        studenti.put("nume", "Maria");
        studenti.put("oras", "Bucuresti");

        HashMap<String, String> produse = new HashMap<>();
        produse.put("produs", "Incarcator");
        produse.put("pret", "200 lei");

        // obtin valorile elementelor cu metoda .get()
        System.out.println(studenti.get("nume") + " este din orasul " + studenti.get("oras") +".");
        System.out.println(produse.get("produs") + " costa " + produse.get("pret") + ".");

        // verific daca exista o cheie cu metoda .containsKey()
        System.out.println("Exista cheia 'nume'? - Raspuns: " + studenti.containsKey("nume"));
        System.out.println("Exista cheia 'preturi'? - Raspuns: " + produse.containsKey("preturi"));

        // sterg o pereche cheie - valoare cu metoda remove()
        studenti.remove("nume");
        System.out.println("Lista de studenti dupa ce am sters numele este: " + studenti);
        produse.remove("pret");
        System.out.println("Lista de produse dupa ce am sters pretul este: " + produse);


        // inlocuiesc valoarea unei chei existente cu metoda replace()
        String valoareVecheStudent = studenti.replace("nume", "Monica");
        System.out.println("Initial numele era " + valoareVecheStudent + ", iar dupa replace acesta este " + studenti.get("nume") + ".");

        String valoareVecheProdus = produse.replace("pret", "225 lei");
        System.out.println("Initial pretul Incarcatorului era " + valoareVecheProdus + ", iar dupa replace pretul este " + produse.get("pret") + ".");

        // adaug o valoare doar daca cheia nu exista
        studenti.putIfAbsent("nume2", "Marius");
        System.out.println("Toti studentii dupa ce am folosit putIfAbsent(): " + studenti);

        produse.putIfAbsent("produs2", "Laptop");
        System.out.println("Tooate produsele dupa ce am folosit putIfAbsent(): " + produse);


        // for-each pentru a parcurge entrySet()
        for (Map.Entry<String, String> entry : studenti.entrySet()) {
            String cheie = entry.getKey();
            String valoare = entry.getValue();
            System.out.println("Cheia " + cheie + " are valoara " + valoare + ".");
        }

        for (Map.Entry<String, String> entry : studenti.entrySet()) {
            String cheieStudent = entry.getKey();
            String valoareStudent = entry.getValue();
            System.out.println(cheieStudent + " este " + valoareStudent + ".");
        }

        for (Map.Entry<String, String> entry : produse.entrySet()) {
            String cheieProdus = entry.getKey();
            String valoareProdus = entry.getValue();
            System.out.println(cheieProdus + " este " + valoareProdus + ".");
        }

        // .forEach() pentru a itera prin HashMap
        studenti.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        produse.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        produse.forEach((key, value) -> {
            System.out.println(value + " este " + key + ".");
        });


    }
}
