import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev ="";
        for(char ch :str.toCharArray()){
            rev=ch+rev;
        }
        System.out.println(rev);
    }
}
