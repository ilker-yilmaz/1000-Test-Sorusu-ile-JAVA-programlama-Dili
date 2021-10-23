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
public class soru_10 {
    public static void main(String[] args){
        System.out.println("soru_10:");
        
        int dizi[][]={{1,2,3},{4,5,6},{7,8,9}};
        int toplam=0;
        for(int i=0; i<3; ++i){
            for(int j=0; j<3; ++j){
                toplam=toplam+dizi[i][j];
                System.out.print(toplam/5);
            }
        }
        System.out.println("");
        
    }
}
