package core.infrastructure;

import core.models.BaseNote;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class NoteProcessor {
    protected List<BaseNote> notes;

    public NoteProcessor(List<BaseNote> notes) {
        this.notes = notes;
    }

    public Map<String,String> getDictionary(){
        Map<String,String> dictionary = new HashMap<>();
        for (BaseNote note: notes) {
            dictionary.put(note.getHead(),note.getBody());
        }
        return dictionary;
    }

}
