package pkg1000_test_sorusu_ile_java_set_31;

public class soru_8 {

    int fonksiyon(int n){
        int sonuc;
        if(n==1)
            return 1;
        sonuc=fonksiyon(n-1)*n;
        return sonuc;
    }
    
}
