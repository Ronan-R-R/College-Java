class Main{
    int x;
    Main(){
        x = 10;
    }
}

class ConsDemo{
    public static void  main(String args[]) {
        Main t1 = new Main();
        Main t2 = new Main();

        System.out.println(t1.x + " " + t2.x);
    }
}