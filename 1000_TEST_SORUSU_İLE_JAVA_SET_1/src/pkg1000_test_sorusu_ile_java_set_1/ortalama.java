package pkg1000_test_sorusu_ile_java_set_1;

/**
 *
 * @author İLKER
 */
public class ortalama {
    public static void main(String[] args) {
        //soru-7
        double sayilar[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
        double sonuc;
        sonuc = 0;
        for (int i = 0; i < 6; i++) {
            sonuc = sonuc + sayilar[i];
        }
        System.out.println("sonuc: " + sonuc / 6);
        
    }
}
