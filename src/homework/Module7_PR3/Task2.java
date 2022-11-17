package homework.Module7_PR3;

/*Write a program with two constant values, one with alternating binary ones and zeroes, with a zero in the
* least-significant digit
* and the second, also alternating, with a one in the least-significant digit.
* Combine these two value every way possible using the bitwise operators.
* Display the results using Integer.toBinaryString().
* Hint: It's easiest to use hexadecimal constants for this.
* Note: that Integer.toBinaryString() does not print leading zeroes
* */

public class Task2 {

    final int firstBinaryNumber = 0x230; //0xA
    final int secondBinaryNumber = 0x231; //0xB

    public String display (int a){
        return Integer.toBinaryString(a);
    }

    public String not (int a){
        return Integer.toBinaryString(~a); // 1 -> 0, 0 -> 1
    }

    public String and (int a, int b){
        return Integer.toBinaryString(a&b); // 1 & 1 = 1, else 0
    }

    public String or (int a, int b){
        return Integer.toBinaryString(a|b); // 1 | 1 = 1 && 1 | 0 = 1, else 0
    }

    public String xor (int a, int b){
        return Integer.toBinaryString(a^b); // 1 | 0 = 1, else 0
    }

    public String signedLeftShift (int a, int b){
        return Integer.toBinaryString(a<<b);
    }

    public String signedRightShift (int a, int b){
        return Integer.toBinaryString(a>>b);
    }

    public String unsignedRightShift (int a, int b){
        return Integer.toBinaryString(a>>>b);
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        System.out.println("First number " + obj.display(obj.firstBinaryNumber));
        System.out.println("Second number " + obj.display(obj.secondBinaryNumber));

        System.out.println("\nNOT(" + obj.display(obj.firstBinaryNumber) + ") = " + obj.not(obj.firstBinaryNumber));
        System.out.println(obj.display(obj.firstBinaryNumber) + " AND "
                + obj.display(obj.secondBinaryNumber) + " = " + obj.and(obj.firstBinaryNumber, obj.secondBinaryNumber));
        System.out.println(obj.display(obj.firstBinaryNumber) + " OR "
                + obj.display(obj.secondBinaryNumber) + " = " + obj.or(obj.firstBinaryNumber, obj.secondBinaryNumber));
        System.out.println(obj.display(obj.firstBinaryNumber) + " XOR "
                + obj.display(obj.secondBinaryNumber) + " = " + obj.xor(obj.firstBinaryNumber, obj.secondBinaryNumber));
        System.out.println(obj.display(obj.firstBinaryNumber) + " << 1"
                + " = " + obj.signedLeftShift(obj.firstBinaryNumber, 1));
        System.out.println(obj.display(obj.firstBinaryNumber) + " >> 1"
                + " = " + obj.signedRightShift(obj.firstBinaryNumber, 1));
        System.out.println(obj.display(obj.firstBinaryNumber) + " >>> 2"
                + " = " + obj.unsignedRightShift(obj.firstBinaryNumber, 2));

    }
}
