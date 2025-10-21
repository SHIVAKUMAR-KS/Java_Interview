package SimpleProgram;

public class armstrong {
    public static void main(String[] args) {
        int num=153;
        int val=num;
        int sum=0;

        while(num>0){
            int digit=num%10;
            int cubic=cubeFunc(digit);
            sum=sum+cubic;
            num=num/10;
        }
        if(sum==val){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not armstrong number");
        }

    }
    public static  int cubeFunc(int digit){
        return digit*digit*digit;
    }
}
