import java.io.*;

class Bill {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Name: ");
        String name = br.readLine();

        System.out.print("Units: ");
        int u = Integer.parseInt(br.readLine());

        double bill;

        if (u <= 100)
            bill = u * 3;
        else if (u <= 200)
            bill = 100 * 3 + (u - 100) * 5;
        else if (u <= 500)
            bill = 100 * 3 + 100 * 5 + (u - 200) * 7;
        else
            bill = 100 * 3 + 100 * 5 + 300 * 7 + (u - 500) * 10;

        if (bill > 5000)
            bill = bill + bill * 0.05;

        System.out.println("Name = " + name);
        System.out.println("Bill = " + bill);
    }
}