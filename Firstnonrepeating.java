import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(char ch:str.toCharArray()){
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.println("First non-repeating character" +ch);
                break;
            }
        }
        
        
    }
}
