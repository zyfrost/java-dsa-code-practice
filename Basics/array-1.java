import java.util.*;

public class helloDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        float[] heights = new float[4];
        String[] names = new String[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i] + " ");
        // }

        for (int num : arr) {// for(datatype ref. variable : in array)
            // System.out.println(num + " ");
        }
        // System.out.println(arr[3]+"This Gives index out of bound error");// index out
        // of bound error
        // multiArrays();
        // threeArray();
        // maximumValue();
        searchElement();
    }

    static void multiArrays() {
        // int[][] arrayName = new int[5][3];
        int[][] arrayName = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };
        System.out.println(arrayName[0][0]);
        System.out.println(arrayName[0][1]);
        System.out.println(arrayName[0][2]);

        System.out.println(arrayName[1][0]);
        System.out.println(arrayName[1][1]);
        System.out.println(arrayName[1][2]);

        System.out.println(arrayName[2][0]);
        System.out.println(arrayName[2][1]);
        System.out.println(arrayName[2][2]);

    }

    static void threeArray() {
        // 3D array is mostly seen in DP(dynamic programming)
        int[][][] arrayName = new int[5][3][2];
        arrayName[0][0][0] = 1;
        System.out.println(arrayName[0][1]);
        System.out.println(arrayName[0][2]);

        System.out.println(arrayName[1][0]);
        System.out.println(arrayName[1][1]);
        System.out.println(arrayName[1][2]);

        System.out.println(arrayName[2][0]);
        System.out.println(arrayName[2][1]);
        System.out.println(arrayName[2][2]);

        System.out.println(arrayName[3][0]);
        System.out.println(arrayName[3][1]);
        System.out.println(arrayName[3][2]);
    }

    static void maximumValue() {

        int[] arr = { 5, 3, 4, 56, 6, 8 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];

            }
        }
        System.out.println("max" + ans);

    }

    static void searchElement() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = { 5, 3, 4, 56, 6, 8 };
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.println("found" + x + "at index " + ans);

    }

}
