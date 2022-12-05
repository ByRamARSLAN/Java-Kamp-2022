public class stringsDemo {

    public static void main(String[] args){

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        // cümlemizin kaç elemandan oluştuğunu bulmak için length()' kullanıyoruz.
        System.out.println("Eleman sayısı : " + mesaj.length());

        // charAt ile cümlede istediğimiz sıradaki karakteri alabiliyoruz
        System.out.println("5. karakterimiz : " + mesaj.charAt(4) + " (charAt istediğimiz sıradaki karakteri verir)");

        // concat, concatination'dan gelir, anlamı birleştirmek
        System.out.println(mesaj.concat(" Yaşasın!" + " (Burada concat ile cümlenin sonuna -Yaşasın!- ekledik)"));

        //Cümlenin başladığı karakteri bulmak için startsWith()'i kullanırız. sonucu true veya false'dır.
        System.out.println(mesaj.startsWith("B") + " (cümle B ile başladığı true sonucunu döndürür.)");

        //Cümlenin bittiği karakteri bulmak için de endsWith()'i kullanırız. sonuç true veya false'tır.
        System.out.println(mesaj.endsWith("k") + " (cümlenin sonu . ile bittiği için false döndürür.)");

        //getChar(srcBegin, srcEnd, sşdşsldöş, dstBegin)
        // srcBegin - srcEnd ile cümlenin neresinden neresine kadar olan karakterleri belirliyoruz
        // charAt'te 3. sıraya karakter dizisinin aktarılacağı bir dizi tanımlamak gerekiyor.
        // dstBegin'de ise srcBegin-srcEnd ile belirlediğim karakterlerden hangi indexten başlamak istediğimi tanımlarım
        char[] karakterler = new char[8];
        mesaj.getChars(3,6, karakterler, 2);
        System.out.println(karakterler);

        // indexOf ile cümlede baştan başlamak şartıyla  hangi karakteri arıyorsak bize sırasını verir.
        System.out.println("ilk a'nın baştan sırası(indexOf) : " + mesaj.indexOf("a"));
        System.out.println("indexOf ile a'nın kaçıncı sırada olduğunu cümlenin başından başlayarak sırasını verir.");

        System.out.println("------------------");

        // lastIndexOf ile cümlenin sonundaki karakterin kaçıncı sırada olduğunu verir
        System.out.println("son a'nın baştan sırası(lastIndexOf) : " + mesaj.lastIndexOf("a"));
        System.out.println("lastIndexOf ile en sondaki a'nın kaçıncı sırada olduğunu cümlenin başından başlayarak sırasını verir.");

        // replace() ile metnimzde değiştirmek istediğimiz karakterleri değiştirebiliyoruz.
        // replace'in içinde oldChar ile newChar yer alır. eski karakter ve yeni karakter anlamlarında
        System.out.println(mesaj.replace(' ', '-'));

        //subString fonku çok fazla kullanılır, bir metnin içerisinden parça alır
        System.out.println(mesaj.substring(0, 5) + " (burada 0. indexten 5. indexe kadar olan karakterleri alır)");
        System.out.println(mesaj.substring(2) + " (burada da 2. indexten itibaren olan kısmı yazdk)");

        System.out.println(mesaj.substring(6) + mesaj.concat(" yehoo"));
        String yeniMesaj = mesaj.substring(6);
        System.out.println(yeniMesaj.concat(" yehoo!!"));

        // split() ile metni bir karakter veya karakter dizisine göre parçalamayı sağlar.
        System.out.println(mesaj.split(" ")); // bu ifade bir döngü gerektirdiğinden çalışmadı.

        // for ile " "(boşluk) karakterini referans alarak parçaladık ve her boşluk için bu işi yapmasını sağladık
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        // toLowerCase ile metnimizin  tümünü küçük harfe dönüştürüyoruz.
        System.out.println(mesaj.toLowerCase());

        // toUpperCase ile metnimizin tümünü büyük harfe dönüştürüyoruz.
        System.out.println(mesaj.toUpperCase());

        // toLowerCase ile toUpperCase fonklarını veri tabanlarında arama yaptığımız zaman kullanırız.

        // trim ile metnimşzşn başındaki ve sonundaki boşlukları aldırıyoruz.
        String newMessage = "      Bugün hava çok güzel.      ";
        System.out.println(newMessage); // çıktımız başında ve sonunda boşluklarla dolu olacak
        System.out.println(newMessage.trim()); // çıktımız başındaki ve sonundaki çıktıları trimleyecek.


    }
}
