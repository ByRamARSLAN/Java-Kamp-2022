public class recapDemo1 {

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 30;
        int sayi3 = 2;

        int enBuyukSayi = sayi1;

        if (sayi2 > enBuyukSayi){
            enBuyukSayi = sayi2;
        }
        if(sayi3 > enBuyukSayi){
            enBuyukSayi = sayi3;
        }

        System.out.println("En büyük sayı : " + enBuyukSayi);

    }
}
