package java_basic_ch7;

public class PitchTest {
    public static void main(String[] args) {

        Pitchable[] pitchers = {new SideArm("A", "eagles"), new UnderHand("B", "giants"), new SideArm("C", "tigers")};

        for (int i = 0; i < 3; i++) {
            pitchers[i].pitch();
        }
    }
}
