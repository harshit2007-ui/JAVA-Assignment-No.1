import java.io.*;

class NumberTool {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Number: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("1. Prime");
        System.out.println("2. Palindrome");
        System.out.println("3. Sum of Digits");

        System.out.print("Enter Choice: ");
        int ch = Integer.parseInt(br.readLine());

        switch (ch) {
            case 1:
                int c = 0;
                for (int i = 1; i <= n; i++)
                    if (n % i == 0)
                        c++;
                if (c == 2)
                    System.out.println("Prime");
                else
                    System.out.println("Not Prime");
                break;

            case 2:
                int temp = n, rev = 0;
                while (temp > 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                if (rev == n)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;

            case 3:
                int sum = 0;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                System.out.println("Sum = " + sum);
                break;
        }
    }
}