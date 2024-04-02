import  java.util.Scanner;

public class Room2 {
    public static void main(String[] args) {

        Scanner ScanLength = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = ScanLength.nextInt();

        Scanner ScanWidth = new Scanner(System.in);
        System.out.println("Enter the width");
        int w = ScanWidth.nextInt();

        int area = l * w;

        System.out.println("The Floor space is " + area + " square feet.");
    }
}