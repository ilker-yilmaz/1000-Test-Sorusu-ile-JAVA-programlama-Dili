package pkg1000_test_sorusu_ile_java_set_23;

public class soru_5 {

    public void m1(int i, float f){
        System.out.println("int float method");     
    }
    public void m1(float f, int i){
        System.out.println("float int method");
    }
    public static void main(String[] args) {
        System.out.println("soru_5:");
        
        soru_5 s=new soru_5();
        s.m1(20f,20);//parametreleri uygun bir şekilde göndermemiz gerekir. gönderdiğimiz parametreler için uygun meod bulunmasa hata verir
    
        System.out.println("");
    }
}
