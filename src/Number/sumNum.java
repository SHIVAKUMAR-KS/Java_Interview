package Number;

public class sumNum {
    public static void main(String[] args) {
        int n=16282;
        int sum=0;
        int m=0;
        while(n>0){
            m=n%10;
            sum+=m;
            n=n/10;
        }
        System.out.println(sum);
    }
}
