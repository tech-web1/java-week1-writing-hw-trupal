package HW;

/**
 * 10.Write a java programme that takes two number as input and display the product
 * of two numbers.
 * Test Data;
 * Input first number : 25
 * Input second number :5
 * Expected output : 25 * 5
 */
public class Multiplication {
    public static void main(String[] args) {
        //First Number declaration
        int firstNumber = 25;
        //Second Number declaration
        int secondNumber = 5;
        int produced = firstNumber *secondNumber;
        //Expected output
        System.out.println(firstNumber +"*"+secondNumber+"="+produced);
    }

}
