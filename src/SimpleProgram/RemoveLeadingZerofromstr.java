package SimpleProgram;

public class RemoveLeadingZerofromstr {
    public static void main(String[] args) {
        String str="00abc";
        removeZero(str);

    }
    public  static  void removeZero(String str){
        int i=0;
        while(i<str.length() && str.charAt(i)=='0'){
            i++;
        }
        StringBuilder sb=new StringBuilder(str);
        sb.replace(0,i," ");
        System.out.println(sb.toString());
    }
}
