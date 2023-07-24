import java.util.Scanner;

public class HouseRobber {
    public static void robber(int arr[],int n){
        int sum_even=0;
        int sum_odd=0;
        for(int i=0;i<n;i++){
            if(i%2!=0)
            {
                sum_even=sum_even+arr[i];
            } else if (i%2==0) {
                sum_odd=sum_odd+arr[i];
            }
        }
        System.out.println(Math.max(sum_even,sum_odd));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        robber(arr,n);
    }
}
