package chapter_3.section4_2;

public abstract class Shape implements MyComparable {
    public String shapeName;

    public Shape( String name ) {
        shapeName = name;
    }

    abstract double computeArea();

    abstract double computePerimeter();

    public int compareTo(Object other) {
        double myArea = computeArea();
        double yourArea = ((Shape)other).computeArea();
        if ( myArea < yourArea) return -1;
        else if (myArea == yourArea) return 0;
        else return 1;
    }
}
