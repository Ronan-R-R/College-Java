import  java.util.Scanner;

public class Payroll2 {
    public static void main(String[] args) {

        //rate
        Scanner ScanHours = new Scanner(System.in);
        System.out.println("Enter the hours hour the week");
        int hours = ScanHours.nextInt();

        //Week Hours
        Scanner ScanRate = new Scanner(System.in);
        System.out.println("Enter the hourly rate");
        int rate = ScanRate.nextInt();

        //Pay
        double GrossPay = rate * hours;

        //tax
        double tax = GrossPay * 0.15;

        //net pay
        double netpay = (GrossPay - tax);

        System.out.println("Gross Pay: R" + GrossPay);
        System.out.println("Withholding tax: R" + tax);
        System.out.println("Net Pay: R" + netpay);

    }
}