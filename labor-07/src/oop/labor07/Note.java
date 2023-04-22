package oop.labor07;

public class Note {
    private static int id = 0;
    private final MyDate date;
    private final Category category;
    private final String text;
    private static int counter = 0;

    public Note(MyDate date, Category category, String text) {
        ++counter;
        id = counter;
        this.date = date;
        this.category = category;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public MyDate getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "date=" + date +
                ", category=" + category +
                ", text='" + text + '\'' +
                '}';
    }
}
