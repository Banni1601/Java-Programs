import java.util.*;


public class Sqrt {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        Scanner ip = new Scanner(System.in);

        int x=ip.nextInt();
        while (x>=0){
            x=(x-a);
            a+=2;
            b+=1;
            if(x==0){
                System.out.println(b);
            }
            else if (x<0){
                System.out.println(b-1);
            }
        }
    }
}
