package core.infrastructure;

import core.models.BaseNote;
import core.models.NoteMapper;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository{

    private final NoteMapper mapper;

    private final FileOperation fileOperation;

    public RepositoryFile(NoteMapper mapper, FileOperation fileOperation) {
        this.mapper = mapper;
        this.fileOperation = fileOperation;
    }

    @Override
    public List<BaseNote> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<BaseNote> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public void saveNotes(List<BaseNote> notes) {
        List<String> lines = new ArrayList<>();
        for (BaseNote item: notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
