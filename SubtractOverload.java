//WAP to overload subtract method with various parameters in a class in java. Write the driver class to use the different subtract methods using object.

class Calculator {
   
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}

class SubtractOverload {
	public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.subtract(10, 5);
        System.out.println("Result of subtracting two integers: " + result1);

        double result2 = calculator.subtract(10.5, 3.5);
        System.out.println("Result of subtracting two doubles: " + result2);

        int[] numbers = {20, 5, 3};
        int result3 = calculator.subtract(numbers);
        System.out.println("Result of subtracting an array of integers: " + result3);
    }
}
