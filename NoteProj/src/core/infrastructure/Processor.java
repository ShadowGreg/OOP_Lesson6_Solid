package core.infrastructure;

import core.models.BaseNote;

import java.util.List;

public class Processor extends NoteProcessor{
    public Processor(List<BaseNote> notes) {
        super(notes);
    }
}
