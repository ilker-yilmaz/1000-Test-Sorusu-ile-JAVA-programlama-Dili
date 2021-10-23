package pkg1000_test_sorusu_ile_java_set_5;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class soru_4 {

    /**
     * thread-safe olmadığı için aynı anda farklı iki thread date formatlama
     * işlemi yaparken, birbirlerinin formatlarını kullanma riski ile karşı
     * karşıyadırlar.
     */
    Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:MM:ss");
        
        String simdi = sdf.format(now);
        //java.sql.Date;
        
        
}
