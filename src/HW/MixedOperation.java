package HW;

/**
 * 9.Write a java programme to print the result of the following operation.
 * Test data:
 * a-5+8*6
 * b.(55+9)%9
 * c.20+-3*5/8
 * d.5+15/3*2-8%3
 * Expected output : 43
 * 1
 * 19
 * 13
 */
public class MixedOperation {
    public static void main(String[] args) {
        //Mixed operation declaration
        int a = -5 + 8 * 6;
        int b = (55+9) % 9;
        int c = 20 + -3* 2 - 8 % 3;
        int d = 5 + 15 /3 *2 -8 % 3;
        //output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
