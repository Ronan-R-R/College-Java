public class Main {
    public static void  main(String[] args){
        char vType = 'S';
        int value = 23000;
        double commRate = 0.08;
        Main(value, commRate, vType);
        Main(40000, 0.10, 'L');
    }
    public static void Main(int value, double rate, char vehicle){
        double commission;
        commission = value * rate;
        System.out.println("\nThe " + vehicle + "type vehicle is worth $" + value);
        System.out.println("With " + (rate * 100) + "% commission rate, the commission is $" + commission);
    }
}
