public class switchDemo {

    public static void main(String[] args) {

        char grade = 'F';//char sadece tek tırnakta tek karakter alır,grade'se seviye derece not anlamlarına gelir

        switch (grade){
            case 'A' :
                System.out.println("Mükemmel bir not, geçtiniz.");
                break;
            case 'B' :
                System.out.println("Çok güzel bir not, geçtiniz.");
                break;
            case 'C' :
                System.out.println("İyi bir not, geçtiniz.");
                break;
            case 'D' :
                System.out.println("Fena değil, geçtiniz.");
                break;
            case 'F' :
                System.out.println("Ne yazık ki kötü bir not, kaldınız.");
                break;
            default:
                System.out.println("Geçersiz bir not girdiniz.");

        }
    }
}
