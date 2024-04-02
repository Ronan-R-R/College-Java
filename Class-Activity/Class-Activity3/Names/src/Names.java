public class Names {
    public static void main(String[] args) {
        // Define family members' names
        String[] familyMembers = {"John", "Jane", "David", "Emily"};

        // Concatenate the names
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : familyMembers) {
            concatenatedNames.append(name).append(" ");
        }

        // Display concatenated names
        System.out.println("Concatenated names: " + concatenatedNames.toString());

        // Calculate and display the length of each name
        for (String name : familyMembers) {
            System.out.println("Length of " + name + ": " + name.length());
        }
    }
}
