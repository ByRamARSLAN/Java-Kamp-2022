public class sesliHarfler {

    public static void main(String[] args){

        char harf = 'e';

        switch (harf){
            case 'a':
            case 'ı':
            case 'u':
            case 'o':
                System.out.println(harf + "  harfi kalın seslidir");
            case 'e':
            case 'i':
            case 'ü':
            case 'ö':
                System.out.println(harf + " harfi ince seslidir.");
                break;
        }


    }
}
