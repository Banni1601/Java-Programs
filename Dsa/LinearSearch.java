package Dsa;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();

        int[] arr = new int[num];
        
        input_for_arr(arr , num);

        System.out.println("Enter the target Element");
        int target = ip.nextInt();

        String result = linear_search( arr, target);

        //System.out.println(Arrays.toString(arr));

        System.out.println(result);
    }

    static void input_for_arr(int[] arr, int num){

        Scanner ip = new Scanner(System.in);
        for(int i=0;i<num;i++){
            arr[i]=ip.nextInt(); 
        }
        

    }
    
    static String linear_search( int[] arr, int target){

        if(arr.length==0){
            return "Array is Empty....";
        }

        for (int i=0; i<arr.length; i++ ){

            if(arr[i]==target){
                return target+" Element Found at "+i+" Index";
            }

        }

        return "Element not Found in Array....";
    }


}
