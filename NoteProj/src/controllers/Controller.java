package controllers;

import viewsV01.Config;
import core.models.NoteMapper;
import core.infrastructure.FileOperationImpl;
import core.models.BaseNote;
import core.infrastructure.Repository;
import core.infrastructure.RepositoryFile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Controller {

    Repository repo = new RepositoryFile(new NoteMapper(), new FileOperationImpl(Config.path));

    public void saveNote(BaseNote inputNote) {
        addNewNote(inputNote);
    }

    public String addNewNote(BaseNote note) {
        List<BaseNote> notes = getAllNotes();
        String newId = UUID.randomUUID().toString();

        note.setId(newId);
        note.setDateTime(LocalDateTime.now());
        notes.add(note);
        repo.saveNotes(notes);

        return TextVariable.noteCreated;
    }

    public List<BaseNote> getAllNotes() {
        return repo.getAllNotes();
    }

    public List<BaseNote> getNote(String inputHead) {
        List<BaseNote> outputNotes = new ArrayList<>();
        List<BaseNote> notes = getAllNotes();

        for (BaseNote note : notes) {
            if (note.getHead().toUpperCase().contains(inputHead.toUpperCase())) {
                outputNotes.add(note);
            }
        }

        return outputNotes;
    }

    public String deleteNote(BaseNote note) {
        List<BaseNote> notes = getAllNotes();
        List<BaseNote> outputNotes = new ArrayList<>();

        for (BaseNote item : notes) {
            if (!item.equals(note)) {
                outputNotes.add(item);
            }
        }

        repo.saveNotes(outputNotes);
        return TextVariable.noteDeleted;
    }

    public BaseNote findByID(List<BaseNote> notes, String inputID) throws Exception {
        for (BaseNote note : notes) {
            if (note.getId().contains(inputID)) {
                return note;
            }
        }
        throw new Exception(TextVariable.noteNotExist);
    }

}
