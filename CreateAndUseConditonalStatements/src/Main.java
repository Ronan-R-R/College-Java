import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

        if(age>18){
            System.out.println("You are of age! You are welcome to vote!! ");
        }else {
                int shortBy = (18 - age);
                System.out.println("sorry, you cannot vote! You can vote after: "
                +shortBy + " years");
                }
    }
}