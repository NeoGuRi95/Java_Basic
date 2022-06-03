package java_basic_ch7;

public class CastingTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        Car car = null;
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        //car.water(); 컴파일 에러
        fe2 = (FireEngine) car;
        fe2.water();
    }

}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drice, Brrr~");
    }

    void stop() {
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}
