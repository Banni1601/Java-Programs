import java.util.*;


public class Lastgreatest_num {
 
    public static void main(String[] args) {
        //System.err.println("hI");

        int[] arr ={0,100,9,8,7,6,5,4,3,2,1};
        
        int result = binarySearch(arr);
        int result1 = binarySearch1(arr);

        System.out.println(result+ " " +result1);
        System.out.println(arr[result1]>arr[result]?result1:result);
    }

    static int binarySearch(int[] arr){
        
        int start=0;
        int end=(arr.length-1)/2;
        int max=arr[start];

        while(start<=end){
            int middle_element=(start+ (end-start )/2 );
            if(arr[middle_element] > max){
                
                max=arr[middle_element];
                end=(middle_element-1);
                //end=(middle_element-1);
            }
            else if(arr[middle_element]<max){
                start=(middle_element+1);
            }
        }
        return start;
    }

    static int binarySearch1(int[] arr){
        
        
        int start=(( arr.length-1)/2 + 1);
        int max= arr[start];
        int end=(arr.length-1);

        while(start<=end){
            int middle_element=(start+ (end-start )/2 );
            if(arr[middle_element] < max){
                
                max=arr[middle_element];
                
                
                end=(middle_element-1);
                //end=(middle_element-1);
            }
            else if(arr[middle_element]<max){
                start=(middle_element+1);
            }
        }


        

        return end;
    }

}
