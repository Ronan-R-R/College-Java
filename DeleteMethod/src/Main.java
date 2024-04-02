public class Main {
    public static void main(String[] args) {
        StringBuffer buff = new StringBuffer("Java lang package");
        System.out.println("buffer = " + buff);

        buff.delete(4, 9);
        System.out.println("After deletion = " + buff);
    }
}