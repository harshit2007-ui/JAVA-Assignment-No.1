import java.io.*;

class Employee {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Employee Name: ");
        String name = br.readLine();

        System.out.print("Enter Basic Salary: ");
        double basic = Double.parseDouble(br.readLine());

        double da = basic * 0.40;
        double hra = basic * 0.20;
        double pf = basic * 0.12;

        double gross = basic + da + hra;
        double net = gross - pf;

        System.out.println("Name = " + name);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}