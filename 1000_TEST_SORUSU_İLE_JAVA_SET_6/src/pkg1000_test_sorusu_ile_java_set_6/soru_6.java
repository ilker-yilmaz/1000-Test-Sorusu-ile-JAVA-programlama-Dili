package pkg1000_test_sorusu_ile_java_set_6;

public class soru_6 {

    public static void main(String[] args) {

        System.out.println("soru_6:");

        int a[] = {1, 2, 3, 4, 5};
        int d[] = a;
        int toplam = 0;
        for (int j = 0; j < 3; ++j) {
            toplam += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
            System.out.println("toplam: " + toplam);
        }
        System.out.println("");
    }

}
