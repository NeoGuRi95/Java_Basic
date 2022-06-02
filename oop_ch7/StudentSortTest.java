package oop_ch7;

public class StudentSortTest {
    public static void main(String[] args) {
        Student[] classA = {new Student(76, 76, 76),
                            new Student(50, 50, 50),
                            new Student(65, 65, 65),
                            new Student(80, 80, 80),
                            new Student(63, 63, 63),};

        studentSort(classA, 5);

        for (int i=0; i < 5; i++) {
            System.out.println(classA[i]);
        }
    }

    public static void studentSort(Student[] sArr, int size) {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sArr[j].compareTo(sArr[j+1]) == 1) {
                    Student tmp = sArr[j];
                    sArr[j] = sArr[j+1];
                    sArr[j+1] = tmp;
                }
            }
        }
    }
}
