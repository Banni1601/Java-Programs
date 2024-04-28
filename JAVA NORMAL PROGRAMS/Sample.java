public class Sample {
    public static void main(String[] args) {
        //System.out.println("Hi");
        long num=5485747475663377L;
        int c=0;
        while(num>0){
            num=(num/10);
            c+=1;
        }
        System.out.println(c);
    }
}
