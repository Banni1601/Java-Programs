import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class AmstrongNumber {

    /**
     * @param args
     * @return
     */

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        int num = ip.nextInt();
        // boolean ans = isAmstrongNumber(num);

        for (int i = 1; i <= num; i++) {
            if (isAmstrongNumber(i)) {
                System.out.println(i);
            }

        }

    }

    static boolean isAmstrongNumber(int num) {
        int o = num;
        int s = 0;
        while (num > 0) {
            int r = num % 10;
            int c = (r * r * r);
            s += c;
            num = num / 10;
        }

        return s == o;
    }

}
