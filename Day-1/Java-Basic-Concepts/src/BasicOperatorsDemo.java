public class BasicOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("a = "+ a + ", b = "+ b);
        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println(" a > b = " + ( a > b));
        System.out.println(" a < b = " + ( a < b));
        System.out.println(" a >= b = " + ( a >= b));
        System.out.println(" a <= b = " + ( a <= b));
        System.out.println(" a == b = " + ( a == b));
        System.out.println(" a != b = " + ( a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y = "+ ( x && y));  // false
        System.out.println("x || y = "+ ( x || y));  // true
        System.out.println("!x = "+ ( !x)); // false

        // Bitwise Operators
        int m = 5, n = 3;
        System.out.println("Bitwise Operators: ");
        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("~m = " + (~m));
        System.out.println("m << 1 = " + (m << 1));
        System.out.println("m >> 1 = " + (m >> 1));

    }
}
