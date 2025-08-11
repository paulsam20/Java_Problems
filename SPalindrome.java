import java.util.*;

class SPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i); // Append each char to rev
        }

        System.out.println(rev);

        
    }
}
