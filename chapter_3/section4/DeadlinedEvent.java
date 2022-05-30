package chapter_3.section4;

public class DeadlinedEvent extends Event {
    public MyDate deadline;

    public DeadlinedEvent(String title, MyDate date) {
        super(title);
        this.deadline = date;
    }

    @Override
    public String toString() {
        return "DeadlinedEvent{" +
                "title='" + title + '\'' +
                ", deadline=" + deadline.toString() +
                '}';
    }

    public boolean isRelevant(MyDate date) {
        return (deadline.compareTo(date) >= 0);
    }

    public MyDate getRepresentativeDate() {
        return deadline;
    }
}
