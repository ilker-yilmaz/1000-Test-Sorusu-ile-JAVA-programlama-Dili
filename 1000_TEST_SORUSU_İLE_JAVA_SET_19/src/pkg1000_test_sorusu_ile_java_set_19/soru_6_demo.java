/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000_test_sorusu_ile_java_set_19;

/**
 *
 * @author İLKER
 */
public class soru_6_demo {

    public static void main(String[] args) {
        System.out.println("soru_6: ");
        soru_6 nesne = new soru_6();
        nesne.yukseklik = 1;
        nesne.uzunluk=5;
        nesne.genislik=5;
        nesne.hacim(3,2,1);
        System.out.println(nesne.hacim);

        System.out.println("");
    }

}
