package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    // clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice
    // un fisier Java poate avea mai multe clase diferentiate pe baza numelui
    // intr-o clasa putem defini proprietatile si actiunile entitatii
    // variabila = proprietatea unei clase
    // variabilele pot fi de 2 feluri: global si local
    // variabilele globale = vizibile peste tot in proiect
    // variabila locala = vizibila doar il locul unde l-ai declarat
    // definire variabila globala: access control (public), tip variabila, nume variabila
    // cand definim o variabila, nu este obligatoriu sa-i dam o valoare
    // metoda = actiunea unei clase
    // 2 tipuri de metode: void si main


    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Gen;
    public Boolean Absolvent;


    @Test
    public void prezentareStudent() {
        Nume = "Buliga";
        Prenume = "Monica";
        Varsta = 10;
        Adresa = "Jupiter, 10";
        Inaltime = 20.10;
        Greutate = 20.10f;
        Gen = 'F';
        Absolvent = false;

        System.out.println(Nume + " " + Prenume);
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenume studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Studentul locuieste la adresa " + Adresa + ", " + "are inaltimea " + Inaltime + ", greutatea " + Greutate);
        System.out.println("Genul studentului este " + Gen);
        System.out.println("Este absolvent? " + Absolvent);

        calculMedie();
    };

    public void calculMedie() {
        Integer nota1 = 10;
        Integer nota2 = 5;
        Integer nota3 = 3;

        Integer medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media studentului este: " + medie);
    }
}
