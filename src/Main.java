public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(15, 10);

        System.out.printf("Sum: %d\n", arithmetic.sum());
        System.out.printf("Multiply: %d\n", arithmetic.multiply());
        System.out.printf("Max: %d\n", arithmetic.max());
        System.out.printf("Min: %d\n", arithmetic.min());
    }
}