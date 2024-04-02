public class Main {
    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void myPublicMethod(){
        System.out.println("Public method must be called by creating objects");
    }

    //Main method
    public static void main(String[] args){
        myStaticMethod(); //call the static method
        //myPublicMethod(); This would output an error

        Main myObj = new Main(); //create an object of Main
        myObj.myPublicMethod(); // Call the public method
    }
}
