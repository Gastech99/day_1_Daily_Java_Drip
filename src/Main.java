import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        // Les types de variables en JAVA

        System.out.println("*******************************************");
        System.out.println("Les différents types de variables");

        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int myNum1;
        myNum1 = 5;
        System.out.println(myNum1);

        int myNum2 = 15;
        myNum2 = 20;  // myNum2 is now 20
        System.out.println(myNum2);

        int myNumber = 5;
        float myFloat = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println("My Integer = "+ myNumber);
        System.out.println("My Float = "+ myFloat);
        System.out.println("My Letter = "+ myLetter);
        System.out.println("My Boolean = "+ myBool);
        System.out.println("My Text = "+ myText);

        System.out.println("*******************************************");
        System.out.println("Lecture solution 1");

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Saisir votre chaine de caractère : ");
        String ch = keyboard.readLine();
        System.out.println("La valeur de ch = "+ch);

        System.out.println("*******************************************");
        System.out.println("Lecture solution 2");
        Scanner keyboard2 = new Scanner(System.in);
        int a;
        System.out.println("Saisir a : ");
        a = keyboard2.nextInt();
        System.out.println("La valeur de a = "+a);
        keyboard2.close();
    }
}
