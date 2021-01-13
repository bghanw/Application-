package ch.bbcag.hellostudent.syntaxauftrag_02;

public class Aufgabe2 {

    public static void main(String[] args) {

        String text = "Viel Glück";

        for (int i = 1; i < 11; i++){

            System.out.println(i+" "+text);
        }

        text = "Wais ";
        int j = 0;

        while (j <= 5){

            System.out.println(text);
            j++;
        }
        j= 0;

        do {
            System.out.println(text);
            j++;

        }
        while (j <= 5);
    }
}
