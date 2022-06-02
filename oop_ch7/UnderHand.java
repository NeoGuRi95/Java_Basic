package oop_ch7;

public class UnderHand  extends Pitcher implements Pitchable {

    String type;

    public UnderHand(String name, String team) {
        super(name, team);
        this.type = "Under Hand";
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
