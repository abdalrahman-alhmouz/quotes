package quotes;

public class ReqContent {
    String quoteText ;
    String quoteAuthor ;
    String quoteLink ;

    @Override
    public String toString() {
        return
                "quoteText='" + quoteText +
                "\n  quoteAuthor='" + quoteAuthor  +
                " \n  quoteLink='" + quoteLink ;
    }
}
