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
public class soru_9_demo {
    public static void main(String[] args) {
        System.out.println("soru_9:");
        
        soru_9 nesne1 = new soru_9();  
        soru_9 obj2=new soru_9();
        
        nesne1.genislik = 1;
        nesne1.yukseklik=2;
        nesne1.uzunluk=1;
        
        obj2=nesne1;
        
        System.out.println(obj2.genislik);
    }
}
