package midterm.filereadsample;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ეს ფაილი სპეციალურად შუალედური გამოცდისთვის არის შექმნილი.
 * ეს კლასი ახდენს ტექსტური ფაილიდან ინფორმაციის კითხვის დემონსტრაციას.
 */
public class ReadTextFromFile {

    public static void main(String[] args) {

        List<String> striqonebi = new ArrayList<>();

        // ყურადღება მივაქციოთ, რომ ფაილიდან კითხვის წინ, "try {"" წერია, ხოლო დამთავრების მერე "catch ..."
        try {
            // შემდეგი ორი ბრძანება ტექსტური ფაილიდან სიაში კითხულობს ყველა სტრიქონს.
            URI uri = ReadTextFromFile.class.getResource("./data/data.txt").toURI();
            striqonebi = Files.readAllLines(Paths.get(uri), Charset.defaultCharset());

            // ყურადღება მივაქციოთ, რომ ფაილიდან კითხვის შემდეგ, ეს სამი სტრიქონი არის აუცილებელი.
        } catch (Exception ex) {
            System.out.println("Error occured");
        }

        // ეკრანზე ვბეჭდავთ ფაილიდან წაკითხულ სტრიქონებს.
        for (var striqoni : striqonebi) {
            System.out.println(striqoni);
        }

        // სტრიქონები უკვე გვაქვს სიაში ჩაწერილი და შეგვიძლია დავამუშავოთ ჩვენი სურვილისამებრ.

    }
}