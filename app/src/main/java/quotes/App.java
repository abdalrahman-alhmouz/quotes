/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(randomBook("app/src/main/resources/recentquotes.json").getClass().getName());

    }
    public static String randomBook(String path) throws FileNotFoundException {
        Gson gson=new Gson();
        Reader reader = new FileReader(path);
        Contact[] book = gson.fromJson(reader, Contact[].class);
        int rand= (int) (Math.random()*book.length);
//        System.out.println();
        return ""+book[rand];
    }
}
