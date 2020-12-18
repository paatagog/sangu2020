package klasi.interfeisi.model;

/**
 * ეს არის ადამიანის შესაბამისი კლასი.
 * ადამიანი შეიძლება ერთდროულად წარმოადგენდეს თამაშის პერსონაჟსაც
 * და ამავდოულად არის ძუძუმწოვარიც.
 * ეს კლასი ორი ინტერფეისის მხარდამჭერაია
 */
public class Person implements Mammal, Character {
    String name, surName, pn;
    float weight;
    MammalType type = MammalType.HUMAN;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

}
