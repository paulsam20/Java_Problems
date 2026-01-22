import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String[] word = str.trim().split("\\s+");
        String rev="";
        for(int i =word.length-1;i>=0;i--){
            rev=rev+word[i]+" ";
        }
        System.out.print(rev);
    }
}
