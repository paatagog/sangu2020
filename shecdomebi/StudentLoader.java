package shecdomebi;

import midterm.filereadsample.ReadTextFromFile;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentLoader {
    public static List<Student> load(String fileName) throws SanguException {
        List<Student> students = new ArrayList<>();
        try {
            URI uri = StudentLoader.class.getResource(fileName).toURI();
            List<String> studs = Files.readAllLines(Paths.get(uri), Charset.defaultCharset());
            for (var stud : studs) {
                String[] stdArr = stud.split(" ");
                students.add(new Student(stdArr[0], stdArr[1], Integer.parseInt(stdArr[2])));
            }
        } catch (Exception ex) {
            SanguException sanguException = new SanguException("ვერ მოხერხდა ფაილიდან სტუდენთა სიის წაკითხვა");
            throw sanguException;
        }
        return students;
    }
}
