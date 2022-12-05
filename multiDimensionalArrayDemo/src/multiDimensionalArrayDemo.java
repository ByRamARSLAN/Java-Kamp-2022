public class multiDimensionalArrayDemo {

    public static void main(String[] args){
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Çanakkale";
        sehirler[0][2] = "Tekirdağ";
        sehirler[1][0] = "Diyarbakır";
        sehirler[1][1] = "Batman";
        sehirler[1][2] = "Mardin";
        sehirler[2][0] = "Bingöl";
        sehirler[2][1] = "Ağrı";
        sehirler[2][2] = "Bitlis";

        for(int i = 0 ; i < 3; i++){
            System.out.println("------------------------");
            for(int j = 0 ; j < 3 ; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
