package pkg1000_test_sorusu_ile_java_set_26;

public class soru_9_demo {

    public static void main(String[] args) {
        System.out.println("soru_9: ");
        soru_9 obj1 = new soru_9();
        soru_9 obj2 = new soru_9();
        int a = 2;
        obj1.ekle(a, a + 1);
        obj2.ekle(5, a);
        System.out.println(obj1.x + " " + obj2.y);

    }
}
