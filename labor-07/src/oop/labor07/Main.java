package oop.labor07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("labor07");

        NoteBook noteBook = new NoteBook("Jegyzetek");

        MyDate date1 = new MyDate(2023, 2, 28);
        Note note1 = new Note(date1, Category.UNIVERSITY, "3. OOP hazi");
        noteBook.addNote(note1);

        MyDate date2 = new MyDate(2023, 3, 20);
        Note note2 = new Note(date2, Category.UNIVERSITY, "DSA parcialis");
        noteBook.addNote(note2);

        System.out.println("Jegyzetek:");
        noteBook.printAll();
        //System.out.println(note2.getId());
        System.out.println();

        System.out.println("Torles utan:");
        System.out.println(noteBook.deleteNote(3));
        noteBook.printAll();
        System.out.println();

        System.out.println("Talalatok kategoria szerint:");
        System.out.println(noteBook.findNotesByCategory(Category.UNIVERSITY));
        System.out.println();

        System.out.println("Talalatok kulcsszo szerint:");
        System.out.println(noteBook.findNotesByKeyword("OOP"));
        System.out.println();

        System.out.println("Talalatok tobb kulcsszo szerint:");
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("DSA");
        keywords.add("OOP");
        System.out.println(noteBook.findNotesByKeywords(keywords));
        System.out.println();

    }
}
