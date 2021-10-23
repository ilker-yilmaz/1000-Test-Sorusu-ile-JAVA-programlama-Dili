package pkg1000_test_sorusu_ile_java_set_23;

public class soru_8_demo {

    public static void main(String[] args) {
        System.out.println("soru_8:");

        soru_8 ornek = new soru_8();
        int a = 2;
        double b = 3.2;
        ornek.ekle(a, a);
        ornek.ekle(b, b);
        System.out.println(ornek.x + " " + ornek.y);

        System.out.println("");
    }

}
