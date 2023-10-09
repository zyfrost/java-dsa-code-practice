import java.util.*;

// import learnJava.*;
public class helloDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern7(n);
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {// ROW
            for (int j = 0; j < n; j++) {// Column
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        // inner loop -space part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            } // outer loop - star pattern

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                sum++;
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        // upper half
        for (int i = 1; i <= n; i++) {
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    // HW: Make a Hollow Rhombus
    static void pattern5(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        // Spaces
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            // first half - descending order
              for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // second half number - ascending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}

// Pattern1
// *****
// *****
// *****
// *****
// *****

// Pattern2
// *****
// * *
// * *
// * *
// *****
/*
 * static return type name(arguments){
 * //body
 * return statement;
 * }
 */
