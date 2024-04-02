public class Main {
    public static void main(String[] args) {
        String Str = new String("Welcome to Java.com");

        System.out.print("Return value: ");
        System.out.println(Str.replace('O', '*'));

        System.out.print("Return value: ");
        System.out.println(Str.replace('e', '$'));
    }
}