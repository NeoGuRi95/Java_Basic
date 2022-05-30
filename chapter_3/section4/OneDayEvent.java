package chapter_3.section4;

public class OneDayEvent extends Event {
    public MyDate date;

    public OneDayEvent(String title, MyDate date) {
        super(title);
        this.date = date;
    }

    @Override
    public String toString() {
        return "OneDayEvent{" +
                "title='" + title + '\'' +
                ", date=" + date.toString() +
                '}';
    }

    public boolean isRelevant(MyDate date) {
        return (this.date.compareTo(date) == 0);
    }

    public MyDate getRepresentativeDate() {
        return date;
    }
}
