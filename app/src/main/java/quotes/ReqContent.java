package quotes;

public class ReqContent {
    String quoteText ;
    String quoteAuthor ;
    String quoteLink ;

    @Override
    public String toString() {
        return "ReqContent{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }
}
