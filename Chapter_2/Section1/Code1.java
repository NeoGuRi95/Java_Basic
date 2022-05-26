package Chapter_2.Section1;

public class Code1 {
    public static void main(String[] args) {
        Person1 first; // create variable
        first = new Person1(); // create object

        first.name = "John";
        first.number = "012483120";

        System.out.println("name: " + first.name + ", number: " + first.number);

        Person1[] members = new Person1[100];
        members[0] = first;
        members[1] = new Person1();
        members[1].name = "David";
        members[1].number = "287565215";

        System.out.println("name: " + members[1].name + ", number: " + members[1].number);
    }
}
