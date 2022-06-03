package java_basic_ch7;

abstract class Player {
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos);
    abstract void stop();

    void play() {
        play(currentPos);
    }

    void pause() {
        if (pause == true) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }
}

class CDPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "에서 노래를 재생합니다!");
    }

    void stop() {
        System.out.println("노래를 멈춥니다!");
    }
}
public class PlayerTest {
    public static void main(String[] args) {
        CDPlayer a = new CDPlayer();
        a.play(4);
        a.stop();
    }
}
