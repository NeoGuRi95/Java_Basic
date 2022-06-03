package java_basic_ch8;

public class ExceptionEx {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;
        int divider = 0;

        for (int i = 0; i < 10; i++) {
            try {
                divider = (int)(Math.random() * 10);
                result = 100 / divider;
                System.out.print(result);
                System.out.println("/" + divider);
            } catch (ArithmeticException ae) {
                System.out.println(divider);
            }
        }
    }
}
