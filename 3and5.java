import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("divisble by 5 and 3");
        }
        else{
            System.out.println("not divisble by 5 and 3");
        }
    }
}
