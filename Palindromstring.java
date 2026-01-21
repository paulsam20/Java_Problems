import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev ="";
        for(char ch :str.toCharArray()){
            rev=ch+rev;
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
    }
}
