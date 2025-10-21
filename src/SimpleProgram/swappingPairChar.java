package SimpleProgram;

public class swappingPairChar {
    public static void main(String[] args) {
        String str="computer";
        swap(str);
    }
    public static void swap(String str){

        char arr[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i=i+2){
            char temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println(arr);
    }
}
