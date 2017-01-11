/**
 * Created by Vladimir on 01.11.2016.
 */
public class listening9 {
    public static void main(String[] args) {


        int result = 12000;
        int pr = 0;
        int cr;

        for (int i = 0; i < 10; i++) {
            pr = result + (pr + result)*6/100;
            System.out.println(pr);

        }
        System.out.println(result);
    }
}
