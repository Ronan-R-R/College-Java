public class Payroll {
    public static void main(String[] args) {

        //rate
        double hrate = 10.50;
        //Week Hours
        int hours = 40;

        //Pay
        double GrossPay = hrate * hours;

        //tax
        double tax = GrossPay * 0.15;

        //net pay
        double netpay = GrossPay - tax;

        System.out.println("Gross Pay: R" + GrossPay);
        System.out.println("Withholding tax: R" + tax);
        System.out.println("Net Pay: R" + netpay);

    }
}