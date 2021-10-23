package pkg1000_test_sorusu_ile_java_set_4;

import java.math.BigDecimal;

public class soru_3 {

    public static void main(String[] arguments) {

        System.out.println("soru-3");

        double a = 0.02;
        double b = 0.03;
        double c = b - a;

        System.out.println("c: " + c);

        BigDecimal _a = new BigDecimal("0.02");
        BigDecimal _b = new BigDecimal("0.03");
        BigDecimal _c = new BigDecimal(b).subtract(_a);

        System.out.println("_c: " + _c);
    }

}
