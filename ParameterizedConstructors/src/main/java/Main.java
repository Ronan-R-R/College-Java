//A parameterized constructor
public class Main {
    int x;

    Main (int i) { //this constructor has a parameter
        x = 1;
    }
}
class ParmConsDemo{
    public static void main(String args []){
        Main t1 = new Main(10);
        Main t2 = new Main(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
