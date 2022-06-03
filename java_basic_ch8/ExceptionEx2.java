package java_basic_ch8;

public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program end");
    }
}
