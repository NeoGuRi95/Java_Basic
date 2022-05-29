package chapter_3.section3;

public class Test {
    public int a = 10;
    public double x = 1.23;

    @Override
    public String toString() {
        return a + " " + x;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Test other2 = (Test)obj; //type casting
            return a == other2.a && x == other2.x;
        } else
            return false;
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();

        System.out.println(test1.toString());

        if (test2.equals(test1))
            System.out.println("yes");
        else
            System.out.println("no");

        Object[] array = new Object[100];

        int a = 20;
        //Integer age = new Integer(a);
        array[0] = a; // auto boxing
        int b = (Integer)array[0]; // auto unboxing
    }
}
