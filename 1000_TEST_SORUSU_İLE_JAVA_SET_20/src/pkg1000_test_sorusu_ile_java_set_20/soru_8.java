/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000_test_sorusu_ile_java_set_20;

/**
 *
 * @author İLKER
 */
public class soru_8 {
    int genislik;
    int yukseklik;
    int uzunluk;
    int hacim;
    void sonlandır(){
        hacim=genislik*yukseklik*uzunluk;
        System.out.println("void sonlandır method: "+hacim);
    }
    protected void hacim(){
        hacim = genislik*yukseklik*uzunluk;
        System.out.println("protected void hacim method: "+hacim);
    }
}
