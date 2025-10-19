package Number;

public class checkNumPrime {
    public static void main(String[] args) {
        int n=7;
        int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }else{
                flag=1;
            }

        }
        if(flag==1){
            System.out.println(n+ " is prime");
        }else{
            System.out.println(n+ " is not prime");
        }
    }
}
