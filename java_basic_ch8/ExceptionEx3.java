package java_basic_ch8;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // throw new Exception(); // not compiled, checked exception
        throw new RuntimeException(); // compile available, unchecked exception
    }
}
