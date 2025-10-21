package SimpleProgram;

import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[] =new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target");
        int target=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index "+i);
                break;
            }
        }
    }
}
