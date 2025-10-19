package Number;

public class palindromeNum {
    public static void main(String[] args) {
        int n=101;
        int sum=0;
        int m=n;
        int x=0;
        while(n>0){
            x=n%10;
            sum=sum*10+x;
            n=n/10;
        }
        if(sum==m){
            System.out.println(sum+ " is palindrome");
        }else{
            System.out.println(sum+ " is not palindrome");
        }
    }
}
