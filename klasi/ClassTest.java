package klasi;

import java.util.ArrayList;
import java.util.List;

public class ClassTest {
    public static void main(String[] args) {

        // წინა მეცადინეობიდან შეხსენება
        List<String > sia = new ArrayList<>();

        // ამ ბრძანებით შეიქმნა Student კლასის ობიექტი, რომელსაც student1 დავარქვით.
        // student1-ს მიენიჭა ცარიელი ობიექტი.
        Student student1 = new Student();

        student1.setName("გიორგი");
        student1.setSurName("გიორგაძე");

        System.out.println("student1-ის სახელია: " + student1.getName() + " გვარია: " + student1.getSurName());
        System.out.println();

        // ჯავაში ასეთი კონსტრუქტორი მისაღებია.
        Student student2 = new Student("ნიკო", "ნიკოლაძე");

        System.out.println(student1);

    }
}
