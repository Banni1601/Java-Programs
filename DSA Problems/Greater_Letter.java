import java.util.Arrays;

public class Greater_Letter {

    /**
     * @param args
     */
    public static void main(String[] args) {
         char[] arr = {'c','f','j'};
        
        //System.out.println(Arrays.toString(arr));

        char t='c';
        char ans = binarysearch( arr, t);
        System.out.println(ans);
        
    }

    static char binarysearch(char[] arr, char t){
        
        int l=0;
        int h=arr.length-1;
        int m=0;
    

        while (l<=h) {
            m = (l+(h-l)/2);
            if(arr[m]<t){
                l=(m+1);
            }
            else if (arr[m]>t){
                h=(m-1);
            }
        }
        //char a =char(h);
        return 100;
    }



  
    
}
