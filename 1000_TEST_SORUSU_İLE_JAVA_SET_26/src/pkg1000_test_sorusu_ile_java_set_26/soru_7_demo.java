package pkg1000_test_sorusu_ile_java_set_26;

public class soru_7_demo {

    public static void main(String[] args) {
        System.out.println("soru_7: ");

        soru_7 obj1 = new soru_7();
        soru_7 obj2 = new soru_7();
        obj1.x = 0;
        obj1.y = 0;
        obj1.hesapla(1, 2);
        obj2.x = 0;
        obj2.hesapla(2, 3);
        System.out.println(obj1.x + " " + obj2.y);

        System.out.println("");
    }

}
