
import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = { 1, 3, 4, 56, 77 };
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr_2 = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println("copied Array:");
        System.out.print(arr_2);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
