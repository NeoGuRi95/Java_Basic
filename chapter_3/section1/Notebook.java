package chapter_3.section1;

public class Notebook extends Computer {

    public double screenSize;
    public double weight;

    public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
        super(man, proc, ram, disk, speed);
        screenSize = screen;
        this.weight = weight;
    }

    public String toString() { // overriding
        String result = super.toString() +
                        "\nSreen Size: " + screenSize + " inches" +
                        "\nWeight: " + weight + " kg";
        return result;
    }

    public static void main(String[] args) {
        Computer test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
        //Notebook test2 = new Computer("Dell", "i5", 4, 1000, 3.2); unavailable

        //System.out.println(test.computePower());
        System.out.println(test.toString()); // static binding vs. dynamic binding
        // java: dynamic binding!!
    }
}
