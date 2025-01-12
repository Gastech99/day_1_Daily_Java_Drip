public class Boucles {
    public static void main(String[] args){
        System.out.println("*************************************");
        System.out.println("Résultat du boucle for");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("*************************************");
        System.out.println("Résultat du boucle while");
        int j = 0;
        while (j < 7){
            System.out.println(j);
            j++;
        }


        System.out.println("*************************************");
        System.out.println("Résultat avec la boucle do...while");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        }while (k < 5);
    }
}
