public class MissingNumber {
    public static void main(String[] args) {
        int missingNumber=0;
        int[] arr={0,2};
    int min=arr[0];
    int max=arr[0];
    for(int i:arr){
        if(i<min){
            min=i;
        } 
    }
    for(int i:arr){
        if(i>max){
            max=i;
        } 
    }


    if(arr.length==1 && arr[0]>=1){
        //return arr[0]-1;
        System.out.println(arr[0]-1);
    }
    else{
    for(int i=min;i<max;i++){
        for(int j:arr){
            if(j==i){
                missingNumber+=1;
            }
        }
        if(missingNumber==0){
            System.out.println(i);
            break;
        }
        else if (missingNumber==arr.length-1){
            System.out.println(max+1);
        }
        missingNumber=0;

    }
}
class  {

    
}
    
}
