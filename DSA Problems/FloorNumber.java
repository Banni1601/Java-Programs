public class FloorNumber {
    public static void main(String[] args){
       
        int[] arr = {2,3,5,9,14,15,17,18};
        int target = 4;
        int ans = floorNumber(arr,target);
        System.out.println(ans);

    }

        static int floorNumber(int[] arr,int target){
            int low=0;
            int high=(arr.length-1);
            if(target>arr[arr.length-1]){
                return arr[arr.length-1];
            }
            else{
                while(low<=high){
                    int mid = low+(high-low)/2;
                    if (arr[mid]<target){
                        low=(mid+1);
                    }
                    else if(arr[mid]>target){
                        high=(mid-1);
                    }
                    else{
                        return arr[mid];
                    }
    
                }
            }
            return arr[high];
        }

}   
