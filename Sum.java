import java.util.*;
class Sum{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    System.out.println("The sum of array elements is: "+ sum);
    }
}