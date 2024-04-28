package Dsa;

import java.util.*;



public class BinarySearch {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("Enter Size of Array:");
        int size = ip.nextInt();

        int[] arr = new int[size];
        take_items_into_array(arr,size);

        

        System.out.println("Enter the Target Element:");
        int target=ip.nextInt();

        String result = binarysearch(arr,target);

        System.out.println(Arrays.toString(arr));

        System.out.println(result);
       // ip.close();

    }

    static void take_items_into_array(int[] arr, int size){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Array Elements in one line with space:");
        for(int i=0;i<size;i++){
            arr[i]=ip.nextInt();
        }
        //ip.close();
    }

    static String binarysearch(int[] arr,int target){


        int start=0;
        int end=(arr.length-1);

        boolean isAsc=(arr[start]<arr[end]);

        if(isAsc){
        while(start<=end){
            int middle_element=(start+end)/2;
            if(target==arr[middle_element]){
                return "Target Element "+target+" Fount at "+middle_element+" Index...";
            }
            else if(target>arr[middle_element]){
                start=(middle_element+1);
            }
            else if (target<arr[middle_element]) {
                end=(middle_element-1);
            }
        }
    }
    else{
        while(start<=end){
            int middle_element=(start+end)/2;
            if(target==arr[middle_element]){
                return "Target Element "+target+" Fount at "+middle_element+" Index...";
            }
            else if(target>arr[middle_element]){
                end=(middle_element-1);
            }
            else if (target<arr[middle_element]) {
                start=(middle_element+1);
            }
        }
    }
        return "Target Elemet is NOT FOUND...";
    }

}
