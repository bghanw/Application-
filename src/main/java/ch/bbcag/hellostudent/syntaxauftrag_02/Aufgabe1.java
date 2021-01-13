package ch.bbcag.hellostudent.syntaxauftrag_02;

public class Aufgabe1 {

    public static void main(String[] args) {

        int a = -1;
		double b = 10.0;
		// Deklariton und Defination von Variable a und b

        double resultat = a + b;
                String text = ("Das Resultat ist: " + resultat);

        if (resultat < 10.0) {
            System.out.println("Gratulation!");
        }	else  {
                System.out.println(text);
		}

    }

}
