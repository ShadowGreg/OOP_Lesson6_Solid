package core.models;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Note extends BaseNote {
    public Note(String head, String text) {
        super(head, text);
    }

    public String getHead() {
        return super.head;
    }

    @Override
    String generateID() {
        return String.valueOf(new AtomicInteger().incrementAndGet());
    }

    @Override
    LocalDateTime setTimeDate() {
        return LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format(
                "Note Head: \n" +
                        super.head +
                        "Text: \n" +
                        super.text + "\n" +
                        "Date: " + super.dateTime
        );
    }
}
