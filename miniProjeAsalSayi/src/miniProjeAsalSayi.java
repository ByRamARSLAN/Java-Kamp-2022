public class miniProjeAsalSayi {

    public static void main(String[] args){

        int sayi = 2;

        if (sayi < 2 ){
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i < sayi; i++){

            if (sayi % i == 0){
                System.out.println(sayi + " sayısı asal değildir.");
                return;
            }
        }
        System.out.println(sayi + " sayısı asaldır.");
    }
}
