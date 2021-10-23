/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000_test_sorusu_ile_java_set_18;

/**
 *
 * @author İLKER
 */
public class soru_8_demo {

    public static void main(String[] args) {
        System.out.println("soru_8:");
        
        soru_8 nesne = new soru_8();
        
        nesne.genislik = 10;
        nesne.yukseklik=2;
        nesne.uzunluk=10;
        
        int y=nesne.genislik*nesne.yukseklik*nesne.uzunluk;
        System.out.println("y: "+y);
        
        System.out.println("");
    }
}
