import java.util.Arrays;

public class First_and_Last_Index_Of_Target_element {
    
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,8,9};
        //System.out.println(Arrays.toString(arr));

        int t=8;
        int ans = first_index( arr, t);
        System.out.println(ans);

    }

    static int first_index(int[] arr, int t){
        
        int l=0;
        int h=arr.length-1;
        int m=0;
    

        while (l<=h) {
            m = (l+(h-l)/2);
            if(arr[m]<t){
                l=(m+1);
            }
            else if (arr[m]>t){
                //p=arr[m];
                h=(m-1);
            }
            else if (arr[m]==t){
                l=(m+1);
            }
        }
        return h;
    }

}
