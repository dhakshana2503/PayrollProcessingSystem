import java.util.Scanner;

class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        System.out.print("Enter Other Deductions: ");
        double otherDeductions = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.05;

        double gross = basic + hra + da + bonus;
        double deductions = pf + otherDeductions;
        double net = gross - deductions;

        System.out.println("\n===== EMPLOYEE PAYSLIP =====");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.printf("Basic Salary  : %.2f%n", basic);
        System.out.printf("HRA           : %.2f%n", hra);
        System.out.printf("DA            : %.2f%n", da);
        System.out.printf("Bonus         : %.2f%n", bonus);
        System.out.printf("PF            : %.2f%n", pf);
        System.out.printf("Other Deductions: %.2f%n",
                          otherDeductions);
        System.out.printf("Gross Salary  : %.2f%n", gross);
        System.out.printf("Total Deductions: %.2f%n", deductions);
        System.out.printf("Net Salary    : %.2f%n", net);
        System.out.println("============================");

        sc.close();
    }
}