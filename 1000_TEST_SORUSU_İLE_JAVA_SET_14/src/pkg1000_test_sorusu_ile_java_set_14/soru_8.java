/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000_test_sorusu_ile_java_set_14;

/**
 *
 * @author İLKER
 */
public class soru_8 {

    public static void main(String[] args) {
        System.out.println("soru_8: ");
        int x = 2;
        int y = 0;
        for (; y < 10; ++y) {
            if (y % x == 0) {
                continue;
            } else if (y == 8) {
                break;
            } else {
                System.out.print(y + " ");
            }

            System.out.println("");
        }
    }
}
