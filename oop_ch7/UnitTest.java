package oop_ch7;

abstract class Unit {
    int x, y; // current position
    abstract void move(int x, int y);
    void stop() { System.out.println(this.x + ", " + this.y + " 좌표에서 멈춥니다!"); }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("마린이 " + x + ", " + y + " 좌표로 걸어서 이동합니다!");
    }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("탱크가 " + x + ", " + y + " 좌표로 이동합니다!");
    }
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("수송선이 " + x + ", " + y + " 좌표로 날아서 이동합니다!");
    }
}

public class UnitTest {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};
        for (Unit unit : group) {
            unit.move(100, 200);
        }
    }
}
