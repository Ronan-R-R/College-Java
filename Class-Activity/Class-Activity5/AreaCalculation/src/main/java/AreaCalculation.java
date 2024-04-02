public class AreaCalculation {

    public static double calculateArea(double length, double width) {
        // Calculate the area of the rectangle
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        // Example usage:
        double rectangleLength = 10.0; // Replace with the actual length
        double rectangleWidth = 5.0; // Replace with the actual width

        double areaOfRectangle = calculateArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + areaOfRectangle);
    }
}