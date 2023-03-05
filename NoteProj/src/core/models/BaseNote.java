package core.models;

import core.models.extensions.DateTimeInterface;
import core.models.extensions.IDInterface;

public abstract class BaseNote implements IDInterface, DateTimeInterface {
    protected String head;
    protected String text;

    public BaseNote(String head, String text) {
        this.head = head;
        this.text = text;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object obj) {
        return head == ((BaseNote) obj).getHead() && text == ((BaseNote) obj).getText();
    }

    public abstract BaseNote clearFields();
}
