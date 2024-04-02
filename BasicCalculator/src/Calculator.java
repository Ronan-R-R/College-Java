class Calculator {
    //Adds
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtracts
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplies
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Divides, throws an exception if the divisor is zero
    public double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}