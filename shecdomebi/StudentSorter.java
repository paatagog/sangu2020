package shecdomebi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorter {
    public static List<Student> sort(List<Student> students) {
        // თუ ამ კომპარატორის გამოყენება რამდენიმე ადგილზე გვჭირდბა, მაშინ ცალკე კლასის
        // გაკეთება არის მიზანშეწონილი
        Collections.sort(students, new StudentComparator());

        // თუ მხოლოდ ერთ ადგილზე გვინდა გარკვეული ლოგიკით სიის დალაგება, სჯობს აქვე
        // გადავცეთ Comparator ინტერფეისის განხორციელება და ამისთვის ცალკე კლასი არ შევქმნათ
        Collections.sort(students, new Comparator<Student> () {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getAge() == s2.getAge()) {
                    return s1.getSurname().compareTo(s2.getSurname());
                } else {
                    return s1.getAge() - s2.getAge();
                }
            }
        });
        return students;
    }
}
