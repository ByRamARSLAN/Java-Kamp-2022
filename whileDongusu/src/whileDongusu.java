public class whileDongusu {

    public static void main(String[] args){

        int i = 1;

        while (i < 10){ // i'yi for'da parantezde tanımladık ama while'da önceden tanımlamak gerekiyor
            System.out.println(i);
            i++;

        }
        System.out.println("Döngü bitti");

        // Do While
        int j = 1;
        do{
            System.out.println(j);
            j += 2;

        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
