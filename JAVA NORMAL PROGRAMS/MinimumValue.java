import java.util.*;
import java.util.Scanner;


/**
 * Max
 */
public class MinimumValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        add(arr,num);
        int result = max(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    static void add(int[] arr,int num){
        Scanner ip = new Scanner(System.in);
        for (int i=0;i<num;i++){
            arr[i]=ip.nextInt();
        }
    }

    static int max(int[] arr){
        int max_value=arr[0];
        if (arr.length==0){
            return -1;
        }
        else{
            
            for(int i : arr){
                if (i<max_value){
                    max_value=i;
                }
            }
        }
        return max_value;
    }



  

}
