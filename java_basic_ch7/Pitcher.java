package java_basic_ch7;

public class Pitcher {
    private String name;
    private String team;

    Pitcher(String name, String team) {
        this.name = name;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", team: " + team;
    }
}
