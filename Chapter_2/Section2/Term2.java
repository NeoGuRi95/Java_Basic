package Chapter_2.Section2;

public class Term2 {
    int coef;
    int expo;

    public int calcTerm(int x) {
        return (int) (coef * Math.pow(x, expo));
    }

    public void printTerm() {
        System.out.print(coef + "x^" + expo);
    }
}
