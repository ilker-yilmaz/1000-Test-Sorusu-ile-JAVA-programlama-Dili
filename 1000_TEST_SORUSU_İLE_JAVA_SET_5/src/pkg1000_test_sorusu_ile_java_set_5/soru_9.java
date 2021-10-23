package pkg1000_test_sorusu_ile_java_set_5;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class soru_9 {

    public static void main(String[] args) {

        
        Date dateTime1 = new Date();
        Date dateTime2 = new Date();

//        long difflnMilli= java.time.Duration.between(dateTime1,dateTime2).toMillis();
//        System.out.println("fark: " + difflnMilli);

        Date IlkGun=new GregorianCalendar(2007,9,17,00,00).getTime();//17.09.2007 tarihini alıyoruz.
        Date SonGun=new Date();//date nesnesi oluituyoruz.Bugün kü tarihi almak için.

        long Fark=SonGun.getTime()-IlkGun.getTime();//iki tarih arasındaki farkı hesaplıyoruz.

        System.out.println("Ilk gün : "+(IlkGun.getTime()/(1000*60*60*24)));
        //miladi takvime göre 2007'ye kadar kaç gün geçmiş onu buluyoruz.
        System.out.println("Son gün : "+(SonGun.getTime()/(1000*60*60*24)));
        //miladi takvime göre günümüza kadar kaç gün geçmiş onu buluyoruz.

        System.out.println("Aradaki fark : "+(Fark/(1000*60*60*24)));
        //aradaki farkı aşağıdaki sayıya bölerek gün sayısını buluyoruz.
    }

}
