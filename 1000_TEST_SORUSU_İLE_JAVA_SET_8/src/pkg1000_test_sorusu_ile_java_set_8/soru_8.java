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
public class soru_8 {
    
    public static void main(String[] args){
        System.out.println("soru_8:");
        
        int dizi[]= new int[]{0,1,2,3,4,5,6,7,8,9};
        int n=6;
        n=dizi[dizi[n]/2];
        System.out.println((double)dizi[n]/2);//double olarak tanımlarsak 1.5 değerini bize verecektir.
        
        System.out.println("");
    }
    
}
