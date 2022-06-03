package java_basic_ch7;

final class Singleton {
    private static Singleton s = new Singleton(); // 미리 인스턴스 생성

    private Singleton() {
        // 외부에서 생성자 접근 불가, 따라서 자손 클래스 생성 불가
    }

    public static Singleton getInstance() { // getInstance 메서드를 통해서만 인스턴스 받을 수 있음
        if (s == null)
            s = new Singleton();
        return s; // 항상 유일한 인스턴스 반환
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
    }
}
