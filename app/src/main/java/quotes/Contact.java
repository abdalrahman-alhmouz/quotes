package quotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Contact {
    ArrayList<String> tags=new ArrayList<>();
    String author;
    String likes ;
    String text ;


public Contact(){

}
    public Contact(ArrayList<String> tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "tags=" + tags +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}