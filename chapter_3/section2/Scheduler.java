package chapter_3.section2;

import java.util.Scanner;

public class Scheduler {

    private int capacity = 100;
    // Generic Programming
    // 서로 다른 데이터 타입을 '하나의 데이터 타입 배열'에 저장할 수 있다.
    public Event [] events = new Event[capacity];
    public int n = 0;
    private Scanner kb;

    public void processCommand() {
        kb = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");
            String command = kb.next();

            if (command.equals("addevent")) {
                String type = kb.next();
                if (type.equalsIgnoreCase("oneday"))
                    handelAddOneDayEvent();
                else if (type.equalsIgnoreCase("duration"))
                    handelAddDurationEvent();
                else if (type.equalsIgnoreCase("deadline"))
                    handelAddDeadLineEvent();
            } else if (command.equals("list")) {
                handleList();
            } else if (command.equals("show")) {

            } else if (command.equals("exit")) {
                break;
            }
        }
        kb.close();
    }

    private void handleList() {
        for (int i = 0; i < n; i++) {
            System.out.println("    " + events[i].toString());
        }
    }

    private void handelAddDeadLineEvent() {
        System.out.print("    until: ");
        String dateString = kb.next();
        System.out.print("    title: ");
        String title = kb.next();

        MyDate date = parseDateString(dateString);
        DeadlinedEvent deadLineEv = new DeadlinedEvent(title, date);

        addEvent(deadLineEv);
    }

    private void handelAddDurationEvent() {
        System.out.print("    begin: ");
        String begin = kb.next();
        System.out.print("    end: ");
        String end = kb.next();
        System.out.print("    title: ");
        String title = kb.next();

        MyDate beginDate = parseDateString(begin);
        MyDate endDate = parseDateString(end);
        DurationEvent durationEv = new DurationEvent(title, beginDate, endDate);

        addEvent(durationEv);
    }

    private void handelAddOneDayEvent() {
        System.out.print("    when: ");
        String dateString = kb.next();
        System.out.print("    title: ");
        String title = kb.next();

        MyDate date = parseDateString(dateString);
        OneDayEvent ev = new OneDayEvent(title, date);

        addEvent(ev);
    }

    private void addEvent(Event ev) {
        if (n >= capacity)
            reallocate();
        events[n++] = ev;
    }

    private void reallocate() {
        Event[] tmp = new Event[capacity * 2];
        for (int i = 0; i < n; i++)
            tmp[i] = events[i];
        events = tmp;
        capacity *= 2;
    }

    private MyDate parseDateString(String dateString) {
        String [] tokens = dateString.split("/");

        int year = Integer.parseInt(tokens[0]);
        int month = Integer.parseInt(tokens[1]);
        int day = Integer.parseInt(tokens[2]);

        MyDate date = new MyDate(year, month, day);
        return date;
    }

    public static void main(String[] args) {
        Scheduler app = new Scheduler();
        app.processCommand();
    }
}
