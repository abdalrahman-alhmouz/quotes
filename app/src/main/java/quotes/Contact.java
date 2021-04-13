package quotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Contact {
    ArrayList<String> tags=new ArrayList<>();
    String author;
    String likes ;
    String text ;

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