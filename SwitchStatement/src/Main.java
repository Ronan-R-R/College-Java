public class Main {

    static final int GOOD = 1;
    static final int BAD = 2;

    public static void main(String[] args) {
        int value = GOOD;

        switch(value){
            case GOOD:
                //something good
                System.out.println("Good");
                break;

            case BAD:
                System.out.println("Bad");
                break;

            default:
                //neither one
                System.out.println("Not sure");
                break;
        }
        //Prints only good
    }
}