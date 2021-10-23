package pkg1000_test_sorusu_ile_java_set_24;

public class soru_8_demo {

    public static void main(String[] args) {
        System.out.println("soru_8:");

        soru_8 nesne1 = new soru_8();
        soru_8 nesne2 = new soru_8();
        int a = 2;
        nesne1.ekle(a, a + 1);
        nesne2.ekle(5, a);
        System.out.println(nesne1.x + " " + nesne2.y);

        System.out.println("");
    }

}
