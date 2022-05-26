package Chapter_1.section1;

public class ArrayEx {
    public static void main(String[] args) {
        int [] grades;
        int i;
        grades = new int[5];
        //int [] grades = new int[5]; same

        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 80;
        grades[3] = 70;
        grades[4] = 60;

        System.out.println("for");
        for (i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        i = 0;
        System.out.println("while");
        while (i < grades.length) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
            i++;
        }
    }
}
