import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        // On commence par la boucle for

        int a;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Saisir la valeur de a : ");
        a = keyboard.nextInt();
        if (a > 0){
            System.out.println("La valeur de a est positive !");
        }else if (a < 0){
            System.out.println("La valeur de a est négatif !");
        }else {
            System.out.println("La valeur de a est nulle !");
        }
    }
}
