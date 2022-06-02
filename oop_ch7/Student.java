package oop_ch7;

public class Student implements MyComparable<Student> {
    private int kor;
    private int eng;
    private int math;

    Student(int k, int e, int m) {
        this.kor = k;
        this.eng = e;
        this.math = m;
    }

    @Override
    public String toString() {
        return "Student{" +
                "kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        if (this.math > s.math)
            return 1;
        else if (this.math < s.math)
            return -1;
        else return 0;
    }
}
