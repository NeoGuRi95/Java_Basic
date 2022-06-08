package java_basic_ch11;

import java.util.HashSet;

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SutdaCard2 sutdaCard = (SutdaCard2) o;
        return num == sutdaCard.num && isKwang == sutdaCard.isKwang;
    }

    @Override
    public int hashCode() {
        return ("" + num + isKwang).hashCode();
    }

    @Override
    public String toString() {
        return "SutdaCard{" +
                "num=" + num +
                ", isKwang=" + isKwang +
                '}';
    }
}

public class Excercise11_11 {
    public static void main(String[] args) {
        SutdaCard2 c1 = new SutdaCard2(3,true);
        SutdaCard2 c2 = new SutdaCard2(3,true);
        SutdaCard2 c3 = new SutdaCard2(1,true);
        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
    }
}
