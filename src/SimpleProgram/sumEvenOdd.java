package SimpleProgram;

import java.util.Scanner;

public class sumEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter num:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<num;i++){
            if(arr[i]%2==0){
                sumEven+=arr[i];
            }else{
                sumOdd +=arr[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);

    }
}
