/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000_test_sorusu_ile_java_set_8;

/**
 *
 * @author İLKER
 */
public class soru_7 {

    public static void main(String[] args) {
        System.out.println("soru_7: ");
        
        int dizi[][] = new int[3][];
        dizi[0] = new int[1];
        dizi[1] = new int[2];
        dizi[2] = new int[3];

        int toplam = 0;
        for (int i = 0; i < 3; i++) {//dizinin elemanlarına değer atanması
            for (int j = 0; j < i + 1; ++j) {
                dizi[i][j] = j + 1;
                System.out.println("değerler: "+dizi[i][j]);
            }
        }
        for (int i = 0; i < 3; i++) {//atanan değerlerin toplanması
            for (int j = 0; j < i + 1; ++j) {
                toplam+=dizi[i][j];
                System.out.println("toplam: "+toplam);
            }
        }
        System.out.println("toplam: "+toplam);

        System.out.println("");
    }
}
