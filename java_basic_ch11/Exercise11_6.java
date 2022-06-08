package java_basic_ch11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student2 implements Comparable {
    String name;
    int ban, no, kor, eng, math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f)*10+0.5) / 10f;
    }

   @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", total=" + getTotal() +
                ", avg=" + getAverage() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student4) {
            Student4 s = (Student4) o;
            return this.name.compareTo(s.name);
        } else {
            return -1;
        }
    }
}

public class Exercise11_6 {

    static int getGroupCount(TreeSet tset, int from, int to) {
        Student4 from_s = new Student4("from", 0, 0, from, from, from);
        Student4 to_s = new Student4("to", 0, 0, to, to, to);
        return tset.subSet(from_s, to_s).size();
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student4 && o2 instanceof Student4) {
                    Student4 s1 = (Student4) o1;
                    Student4 s2 = (Student4) o2;
                    return (int) (s1.getAverage() - s2.getAverage());
                }
                return -1;
            }
        });

        set.add(new Student4("홍길동", 1,1,100,100,100));
        set.add(new Student4("남궁성", 1,2,90,70,80));
        set.add(new Student4("김자바", 1,3,80,80,90));
        set.add(new Student4("이자바", 1,4,70,90,70));
        set.add(new Student4("안자바", 1,5,60,100,80));

        Iterator it = set.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
        System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
        System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
        System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
    }
}
