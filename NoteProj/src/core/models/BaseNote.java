package core.models;

import java.time.LocalDateTime;

public abstract class BaseNote {
    protected LocalDateTime dateTime;
    protected String ID;
    protected String head;
    protected String text;

    public BaseNote(String head, String text) {
        this.head = head;
        this.text = text;
        this.ID = generateID();
        this.dateTime = setTimeDate();
    }

    abstract String generateID();

    abstract LocalDateTime setTimeDate();

    public String getHead() {
        return head;
    }

    public String getBody() {
        return String.format(
                "Text: \n"
                        + text + "\n" +
                        "Date: " + dateTime
        );
    }
}
