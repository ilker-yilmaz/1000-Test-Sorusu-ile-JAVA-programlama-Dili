/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000_test_sorusu_ile_java_set_12;

/**
 *
 * @author İLKER
 */
public class soru_9 {
    public static void main(String[] args) {
        System.out.println("soru_9:");
        int x=0,y=1;
        System.out.println("x: "+x);
        x=10;
        if(x!=10 && x/0==0)
            System.out.println("y: "+y);
        else
            System.out.println("y: "+ ++y);
        
        System.out.println("");
    }
}
