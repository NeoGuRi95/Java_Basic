package java_basic_ch11;

import java.util.*;

class Student4 implements Comparable {
    String name;
    int ban, no, kor, eng, math, total, schoolRank;

    public Student4(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        this.total = kor + eng + math;
    }

    int getTotal() {
        return this.total;
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
                ", schoolRank=" + schoolRank +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student4) {
            Student4 s1 = (Student4) o;
            return s1.total - this.total;
        }
        return -1;
    }
}

public class Exercise11_8 {
    public static void calculateSchoolRank(List list) {
        Collections.sort(list);

        int prevRank = 0;
        int prevTotal = 0;
        int length = list.size();

        for (int i = 0; i < length; i++) {
            Student4 s1 = (Student4) list.get(i);
            if (s1.total == prevTotal) {
                s1.schoolRank = prevRank;
                prevRank += 1;
            } else
                s1.schoolRank = prevRank + 1;
            prevRank = s1.schoolRank;
            prevTotal = s1.total;
        }
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Student4("홍길동", 1,3,70,90,70));
        list.add(new Student4("남궁성", 1,1,90,70,80));
        list.add(new Student4("김자바", 1,2,80,80,90));
        list.add(new Student4("이자바", 2,1,70,90,70));
        list.add(new Student4("안자바", 2,2,60,100,80));

        calculateSchoolRank(list);

        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
