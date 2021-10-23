package pkg1000_test_sorusu_ile_java_set_7;

public class soru_9 {
    public static void main(String[] args){
        System.out.println("soru_9:");
        
        String[][] degerler = new String[2][2];
        int x;
        degerler [0]=args;
        x=degerler[0].length;
        for(int y=0; y<x; y++){
            System.out.print(" "+degerler[0][y]);
        }
        System.out.println("");
    }

}
