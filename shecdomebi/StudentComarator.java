package shecdomebi;

import java.util.Comparator;

public class StudentComarator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAge() == s2.getAge()) {
            return s1.getSurname().compareTo(s2.getSurname());
        } else {
            return s1.getAge() - s2.getAge();
        }
    }
}
