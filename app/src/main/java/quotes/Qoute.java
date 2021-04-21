package quotes;

import java.util.ArrayList;
import java.util.Objects;

public class Qoute {
    public Qoute(Contact contact) {
        this.setAuthor(contact.author);
        this.setText(contact.text);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String author;
    private String  text;

    public Qoute() {
    }


    public Qoute(String author, String text) {
        this.author = author;
        this.text = text;
    }


    @Override
    public String toString() {
        return "The quote is: " + this.text+ '\n'+
                "Written by: " + this.author;
    }
}