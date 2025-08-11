import java.util.*;
class Leftrotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d = sc.nextInt();
        d=d%n;
        int[] rotated = new int[n];
        for(int i=0;i<n;i++){
            rotated[i]=arr[(i+d)%n];
        }
        for(int x:rotated){
            System.out.print(x +"");
           
        }
        System.out.println();
    }
}