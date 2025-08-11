import java.util.*;
class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ana = sc.nextLine();
        
        str = str.replaceAll("//s","").toLowerCase();
        ana = ana.replaceAll("//s","").toLowerCase();
        
        if(str.length()!=ana.length()){
            System.out.print("Not an anagram");
        }
        
        char[] n1 = str.toCharArray();
        char[] n2 = ana.toCharArray();
        
        Arrays.sort(n1);
        Arrays.sort(n2);
        
        if (Arrays.equals(n1, n2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }

        
    }
}