import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp < 20) {
            System.out.println("Cold");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}
