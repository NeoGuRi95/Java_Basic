package oop_ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + MyCard.width);
        System.out.println("Card.height = " + MyCard.height);

        MyCard c1 = new MyCard();
        c1.kind = "Heart";
        c1.number = 7;

        MyCard c2 = new MyCard();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1.width = 50;
        c1.height = 80;

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

class MyCard {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;

    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
