package core.infrastructure;

import core.models.BaseNote;

import java.util.List;

public interface Repository {
    List<BaseNote> getAllNotes();
    void saveNotes(List<BaseNote> users);
}
