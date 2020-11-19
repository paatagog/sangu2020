package shecdomebi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSorter {
    public static List<Student> sort(List<Student> students) {
        Collections.sort(students, new StudentComarator());
        return students;
    }
}
