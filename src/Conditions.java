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
        keyboard.close();

        switch (a){
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Veuillez saisir un chiffre entre 1 et 7 svp!");
        }
    }
}
