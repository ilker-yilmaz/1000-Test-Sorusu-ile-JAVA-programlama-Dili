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
public class soru_8 {

    public static void main(String[] args) {
        System.out.println("soru_8:");
        int x = 3;//3=011
        int y = ~x;//y=100=-4
        System.out.println("y: " + y);
        int z;
        z = x > y ? x : y;
        System.out.println("z:" + z);
        
        System.out.println("");
    }
}
