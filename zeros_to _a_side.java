import java.util.*;
class zerostoside{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        fun(arr,n);
    }
    static void fun(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
