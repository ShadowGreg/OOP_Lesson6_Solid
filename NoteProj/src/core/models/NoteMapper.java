package core.models;

import java.time.LocalDateTime;

public class NoteMapper {

    public String map(BaseNote note) {
        return String.format("%s;%s;%s;%s", note.getId(), note.getHead(), note.getDateTime(), note.getText());
    }

    public Note map(String line) {
        String[] lines = line.split(";");
        return new Note(lines[0], lines[1], LocalDateTime.parse(lines[2]), lines[3]);
    }
}
