package klasi.firsttry;

/**
 * დღეს ვისწავლეთ კასების გამოყენება
 * ეს არის სტუდენტის შესაბამისი კლასი
 * რომელსაც აქვს ორი ველი {@code name}, {@code surName}
 */
public class Student {
    private String name, surName;
    int age;

    // ეს არის ცარიელი კონსტრუქტორი
    // ცარიელი კონსტრუქტორი თანდაყოლილი აქვს კლასს მხოლოდ იმ შემთხვევაში
    // თუ მას ჩვენ არა შევუქმნით ცარიელისგან განსხვავებულ კონსტრუქტორს.
    public Student() {

    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
        this.age = 18;
    }

    // ყოველთვის ვეცადოთ კონსტრუქტორის ავტომატურად გენერაციას.
    // თუ რამე განსაკუთრებულის ჩაწერას არ ვგეგმავთ მასში
    public Student(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    // ეს ფუნქცია გადაფარავს ობიექტისგან თანდაყოლილ toString ფუნქციას
    // სწორედ ეს ფუნქცია გამოიძახება თუ ჩვენ ობიექტის ეკრანზე დაბეჭდვას
    // შევეცდებით System.out.println() ბრძანებით
    public String toString() {
        return this.name + " " + this.surName + "; " + age;
    }

    // ეს არის კლასის ჩვეულებრივი ფუნქცია
    public void incAge() {
        this.age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ეს არის გეთერი (getter) name ველისთვის
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
