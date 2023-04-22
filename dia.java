import java.util.*;
public class diamon{
    public static void fundiamond(int a){
       for(int i=0;i<a;i++){
        for(int j=0;j<2*a-1;j++){
            if(j<a-i-1 || j>=a+i){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }System.out.print("\n");
       }
       for(int k=1;k<a;k++){
        for(int l=1;l<2*a-1;l++){
            if(l<=k || l>2*a-1-k){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }System.out.print("\n");
       }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        fundiamond(a);
    }
}