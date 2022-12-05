public class mukemmelSayi {

    public static void main(String[] args){

        int sayi = 496;
        int toplam = 0;

        for(int i = 1; i < sayi; i++){

            if(sayi % i == 0){
                toplam += i;
            }
        }
        if (toplam == sayi){
            System.out.println(sayi + " sayısı mükemmel sayıdır.");
        }else{
            System.out.println(sayi + " sayısı mükemmel sayı değildir.");
        }
    }
}
