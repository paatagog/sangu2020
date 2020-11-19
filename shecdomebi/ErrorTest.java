package shecdomebi;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ეს კლასი გამონაკლისი შემთხვევის დამუშავების სადემონსტრაციოა
 */
public class ErrorTest {
    public static void main(String[] args) {

        List<Student> students= new ArrayList<>();
        try {
            students = StudentLoader.load("studentData.txt");
        } catch (SanguException se) {
            System.out.println(se.getErrorType());
        } finally {
            // აქ შეგვიძლია შევამოწმოთ თუ ფაილი არის გახსნილი.
            // თუ ფაილი გახსნილი დაგვხვდა, მაშინ უნდა დავხუროთ იგი.
            // TODO
            System.out.println("ამ ადგილზე ყოველთვის შემოვა პროგრამის მსვლელობა");
        }

        students = StudentSorter.sort(students);

        try {
            List<String> sia = new ArrayList<>(Arrays.asList("მანქანა", "გემი", "მაგიდა", "უნივერსიტეტი", "გიორგი", "გიორგი"));
            for (int i = 0; i < sia.size() + 1; i++) {
                // ამ სიაში მეექვსე ელემენტი არ არსებობს, ამიტომ მოხდება შეცდომა
                System.out.println(sia.get(i));
            }
        } catch(Exception ex) {
            // შეცდომის დამუშავება შეგვიძლია ამ ადგილზე
            System.out.println("მოხდა გარკვეული შეცდომა");
            ex.printStackTrace();
        }
    }

}
