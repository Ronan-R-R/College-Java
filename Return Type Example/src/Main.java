public class Main {
    public int add(){ //method without arguments
        int x =30;
        int y = 70;
        int z = x+y;
        return z;
    }
    public static void main(String[] args) {
        Main test = new Main();
        int add = test.add();
        System.out.println("The sum of x and y is: " + add);
    }
}