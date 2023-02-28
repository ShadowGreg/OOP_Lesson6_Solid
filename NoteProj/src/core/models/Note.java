package core.models;

import java.time.LocalDateTime;

public class Note extends BaseNote {
    private LocalDateTime dateTime;
    private String Id;
    public Note(){
        super("","");
        this.Id="";
        this.dateTime = LocalDateTime.now();
    }

    public Note(String Id, String head, LocalDateTime dateTime, String text) {
        super(head, text);
        this.dateTime = dateTime;
        this.Id = Id;
    }

    public String getDateTime() {
        return dateTime.toString();
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        int endSubString = 100;
        return String.format(
                "Note Head: \n" +
                        super.head +"\n"+
                        "Text: \n" +
                        getBriefText(endSubString) + "\n" +
                        "Date: " + dateTime +"\n"+
                        "Id: " + Id + "\n"
        );
    }

    private String getBriefText(int maxSize) {
        int startSubString = 0;
        if (super.text.length() > maxSize)
            return super.text.substring(startSubString, maxSize);
        else {
            return super.text;
        }
    }

    @Override
    public BaseNote clearFields() {
        return new Note("","",LocalDateTime.now(),"");
    }
}
