import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int numcount=0;
        int vowelcount=0;
        int spacecount=0;
        int consocount=0;
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                numcount++;
            }
            else if(ch==' '){
                spacecount++;
                
            }
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelcount++;
            }
            else if(ch>='a' && ch<='z'){
                consocount++;
            }
        }
        System.out.println("Digits: " + numcount);
        System.out.println("Vowels: " + vowelcount);
        System.out.println("Spaces: " + spacecount);
        System.out.println("Consonants: " + consocount);
        
    }
}
