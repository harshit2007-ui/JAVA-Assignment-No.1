import java.io.*;

class ArrayDemo {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[10];
        int sum = 0, max, min;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number: ");
            a[i] = Integer.parseInt(br.readLine());
        }

        max = min = a[0];

        for (int i = 0; i < 10; i++) {
            sum += a[i];
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + (sum / 10.0));
    }
}