package SimpleProgram;

import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value/num:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is Even");
        }else{
            System.out.println(n+" is Odd");
        }
    }
}
