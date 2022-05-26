package Chapter_2.Section1;

public class Code1_2 {
    public static void main(String[] args) {
        Person1 first = new Person1();
        first.name = "John";
        first.number = "012483120";
        System.out.println("name: " + first.name + ", number: " + first.number);

        // reference variable
        Person1 second = first; // 'second' store same address with 'first'
        second.name = "Tom"; // change name field of 'second' variable
        System.out.println("name: " + first.name + ", number: " + first.number);

        Person1[] members = new Person1[100];
        members[0] = first;
        members[1] = second;

        System.out.println("name: " + members[0].name + ", number: " + members[0].number);
        System.out.println("name: " + members[1].name + ", number: " + members[1].number);

        members[2] = new Person1();
        members[2].name = "David";
        members[2].number = "156578923";
        System.out.println("name: " + members[2].name + ", number: " + members[2].number);
    }
}
