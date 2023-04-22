package oop.labor07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NoteBook {
    private final String name;
    private ArrayList<Note> notes = new ArrayList<>();

    public NoteBook(String name) {
        this.name = name;
    }

    public void addNote(Note newNote){
        notes.add(newNote);
    }

    public void printAll(){
        for (Note note: notes) {
            System.out.println(note);
        }
    }

    public Note deleteNote(int id){
        for (Note note: notes){
            if (note.getId() == id)
            {
                Note save = new Note(note.getDate(), note.getCategory(), note.getText());
                notes.remove(note);
                return save;
            }
        }
        return null;
    }

    public ArrayList<Note> findNotesByCategory(Category category){
        ArrayList<Note> foundNotes = new ArrayList<>();
        for (Note note: notes){
            if(note.getCategory() == category){
                foundNotes.add(note);
            }
        }
        return foundNotes;
    }

    public ArrayList<Note> findNotesByKeyword(String keyword){
        ArrayList<Note> foundNotes = new ArrayList<>();
        for (Note note: notes){
            if (note.getText().contains(keyword)){
                foundNotes.add(note);
            }
        }
        return foundNotes;
    }

    public ArrayList<Note> findNotesByKeywords(ArrayList<String> keywords){
        ArrayList<Note> foundNotes = new ArrayList<>();
        boolean ok;
        for (Note note: notes){
            ok = false;
            for (int i = 0; i < keywords.size(); i++) {
                if(note.getText().contains(keywords.get(i)) && !ok){
                    foundNotes.add(note);
                    ok = true;
                }
            }
        }
        return foundNotes;
    }

    /*public Category mostNotesCategory(){
    }*/

    void readNotesFromFile(String filename){
        ArrayList<Note> notes = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] tokens = line.split(",");

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
