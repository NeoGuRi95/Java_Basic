package java_basic_ch11;

import java.util.*;

class Student3 implements Comparable {
    String name;
    int ban, no, kor, eng, math;

    public Student3(String name, int ban, int no, int kor, int eng, int math) {
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

class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student4 && o2 instanceof Student4){
            Student4 s1 = (Student4) o1;
            Student4 s2 = (Student4) o2;
            if (s1.ban == s2.ban) {
                return s1.no - s2.no;
            } else {
                return s1.ban - s2.ban;
            }
        } else {
            return -1;
        }
    }
}

public class Exercise11_7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Student4("홍길동", 2,1,100,100,100));
        list.add(new Student4("남궁성", 2,2,90,70,80));
        list.add(new Student4("김자바", 1,3,80,80,90));
        list.add(new Student4("이자바", 1,1,70,90,70));
        list.add(new Student4("안자바", 1,2,60,100,80));

        Collections.sort(list, new BanNoAscending());

        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
