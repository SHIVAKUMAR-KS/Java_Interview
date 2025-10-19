package Number;

public class reverseNum {
    public static void main(String[] args) {
        int m=1034;
        int n=0;
        int sum=0;
        while(m>0){
            n=m%10;
            sum=sum*10+n;
            m=m/10;

        }
        System.out.println(sum);
    }
}
