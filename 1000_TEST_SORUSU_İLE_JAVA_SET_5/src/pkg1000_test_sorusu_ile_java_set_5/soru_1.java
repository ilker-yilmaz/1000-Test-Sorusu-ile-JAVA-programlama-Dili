package pkg1000_test_sorusu_ile_java_set_5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class soru_1 {

    
    public static void main(String[] args) {
        System.out.println("SORU_1");
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:MM:ss");
        System.out.println(sdf.format(new Date())+"");
        String simdi = sdf.format(now);
        System.out.println("Mevcut Tarih:" + "" + simdi);

        
    }

}
