package core.infrastructure;

import core.models.BaseNote;

import java.util.Dictionary;
import java.util.List;

public class NoteBook {
    List<BaseNote> noteBook;

    public NoteBook(List<BaseNote> noteBook) {
        this.noteBook = noteBook;
    }

    public String getNote(String head){

    }

    @Override
    public String toString() {
        StringBuffer notes = new StringBuffer();
        for (BaseNote note: noteBook) {
            notes.append(note.toString());
        }

        return String.valueOf(notes);
    }
}
