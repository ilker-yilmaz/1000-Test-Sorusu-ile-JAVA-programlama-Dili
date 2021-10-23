package pkg1000_test_sorusu_ile_java_set_6;

public class soru_7 {

    public static void main(String[] args) {
        System.out.println("soru_7:");

        int dizi[] = new int[10];
        for (int i = 0; i < 10; ++i) {
            dizi[i] = i / 2;
            dizi[i]++;
            System.out.print(dizi[i] + " ");
            i++;
        }
        System.out.println("");
    }
}
