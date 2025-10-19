package Number;

public class primeinRange {

    public static void main(String[] args) {
        int n1=4;
        int n2=30;
        int flag=0;
        for(int i=n1;i<=n2;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }else{
                    flag=1;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }
    }
}
