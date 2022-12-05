public class arraysDemo {

    public static void main(String[] args){
        String ogrenci1 = "Bayram";
        String ogrenci2 = "Elif";
        String ogrenci3 = "Muhammed";
        String ogrenci4 = "Zeliş Beriş";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------------------");
        System.out.println("Buraya kadar uzun yoldan yaptık, teker teker öğrenci kaydettik");
        System.out.println("------------------------");

        System.out.println("***************");

        System.out.println("Şimdi stringlerden oluşan bir dizi tanımlayalım");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Bayram";
        ogrenciler[1] = "Elif";
        ogrenciler[2] = "Muhammed";
        ogrenciler[3] = "Zeliş Beriş";

        for (int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("***************");
        System.out.println("Başka bir for kullanımı örneği");
        System.out.println("------------------------");

        for(String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }



    }
}
