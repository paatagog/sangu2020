package klasi.interfeisi;

import klasi.interfeisi.model.Person;

public class InterfacePlayGround {
    public static final int ZERO = 0;
    public static final double PI = 3.141526;

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("სალომე");
        p.setSurName("გიორგაძე");
        p.setPn("12345678912");
        p.setWeight(65);

        GameEngine.draw(p);
        BiologyTest.test(p);
    }
}
