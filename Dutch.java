import java.util.*;

class Dutch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int zero = 0, one = 0, two = 0;
        
        // Count occurrences of 0, 1, and 2
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else if (arr[i] == 2) {
                two++;
            }
        }
        
        // Overwrite array based on counts
        int index = 0;
        for (int i = 0; i < zero; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < one; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < two; i++) {
            arr[index++] = 2;
        }
        
        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
    }
}
