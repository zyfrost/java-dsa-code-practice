import java.util.*;

// import learnJava.*;
public class helloDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // printFactorial(n);
        // printAverage(a, b, c);
        // printOddNo(n);
        // greaterNo(a, b);
        // circumference(n);
        // ageToVote(n);
        // posNegZeros(n);
        // powerOfN(b, n);
        gcd(a, b);
        System.out.println("gcd is " + a + "and " + b);

    }

    static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("invalid Number");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;// fact = fact * i;

        }
        System.out.println(fact);
        return;
    }

    static void printAverage(int a, int b, int c) {
        int sum = 0;
        sum = (a + b + c) / 3;
        System.out.println(sum);
    }

    static void printOddNo(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    static void greaterNo(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return;
        } else {
            System.out.println(b);
            return;
        }
    }

    static void circumference(int n) {
        double pi = 3.142;
        double circumference = (int) (2 * pi * n);// used typecast
        System.out.println(circumference);
    }

    static void ageToVote(int n) {
        if (n > 18) {
            System.out.println("Eligible to Vote");
            return;
        } else {
            System.out.println("Get Big Kid");
            return;
        }
    }

    static void posNegZeros(int n) {
        if (n > 0) {
            System.out.print("The Positive is :" + n);
        } else if (n < 0) {
            System.out.println("the Negative is :" + n);
        } else {
            System.out.println("the Zeros are:" + n);
        }
    }

    static void powerOfN(int b, int n) {
        System.out.println(Math.pow(b, n));
    }

    static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

}
