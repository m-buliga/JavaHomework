package Homework;

import java.util.ArrayList;

public class TemaSession3 {
    public static void main(String[] args) {
        // Arrays
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringArray = {"Matematica", "Fizica", "Biologie", "Chimie", "Logica"};
        double[] doubleArray = {5.5, 6.8, 7.2, 8.3, 9.6};

        // Array Lists
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        // adaugam elemente in liste
        intList.add(7);
        intList.add(8);
        intList.add(9);

        stringList.add("Alb");
        stringList.add("Negru");
        stringList.add("Albastru");
        stringList.add("Verde");

        doubleList.add(4.4);
        doubleList.add(5.5);
        doubleList.add(6.6);


        // apelare functii
        functieArray(intArray, stringArray, doubleArray);
        functieArrayList(intList, stringList, doubleList);
    }


    private static void functieArray(int[] intArray, String[] stringArray, double[] doubleArray) {

        // "for" pentru int array
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 3) {
                continue;
            }
            else if (intArray[i] == 8) {
                break;
            }
            System.out.println("Valoarea lui intArray este: " + intArray[i]);
        }

        for (int intArr : intArray) {
            System.out.println("Printeaza pe rand toate numerele din intArray: " + intArr);
        }


        // "for" pentru string array
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("Biologie")) {
                return;
            }
            System.out.println("Valoarea lui stringArray este: " + stringArray[i]);
        }

        for (String strArr : stringArray) {
            if (strArr.equals("Chimie")) {
                return;
            }
            System.out.println("Valoarea lui stringArray este agala cu: " + strArr);
        }


        // "for" pentru double array
        for (int i = 0; i < doubleArray.length; i++){
            if (doubleArray[i] == 5.5) {
                continue;
            }
            else if (doubleArray[i] == 8.3) {
                break;
            }
            System.out.println("Valoarea lui doubleArray este: " + doubleArray[i]);
        }

        for (double doubleArr : doubleArray) {
            if (doubleArr == 9.6) {
                return;
            }
            System.out.println("Valoarea lui doubleArray este agala cu: " + doubleArr);
        }
    }


    private static void functieArrayList(ArrayList<Integer> intList, ArrayList<String> stringList, ArrayList<Double> doubleList) {

        // "for" pentru Integer Array List
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == 8) {
                continue;
            }
            System.out.println("Itereaza prin integer array list, sari peste numarul 8 si afiseaza numarul la care am ajuns: " + intList.get(i));
        }


        // "for" pentru String Array List
        for (String str : stringList) {
            if (str.equals("Albastru")) {
                break;
            }
            System.out.println("Itereaza prin string array list, opreste iterarea daca valoarea e Albastru si afiseaza valoarea la care ai ajuns: " + str);
        }

        
        // "for" pentru Double Array List
        for (int i = 0; i < doubleList.size(); i++) {
            System.out.println("Itereaza prin toate valorile din double array list si afiseaza-le pe rand: " + doubleList.get(i));
        }
    }
}
