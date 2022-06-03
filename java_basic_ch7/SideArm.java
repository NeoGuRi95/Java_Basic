package java_basic_ch7;

public class SideArm extends Pitcher implements Pitchable {

    private String type;

    SideArm(String name, String team) {
        super(name, team);
        this.type = "Side Arm";
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.type;
    }

    @Override
    public void pitch() {
        System.out.println(this.toString() + "투수가 던집니다!");
    }
}
