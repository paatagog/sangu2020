public class Davaleba {

    public static void main(String[] args) {
        String[] class1 = {"გიორგი", "ბექა", "მანანა", "მამუკა", "ნინო", "გოჩა", "ნატო"};
        String[] class2 = {"ნოდარი", "მარიამი", "გიორგი", "ლანა", "გუგა", "რატი", "ნაზი", "ჯონ", "გიორგი", "ლელა", "ლევანი"};

        String[] class3 = new String[class1.length + class2.length];

        int pos = 0;
        String newPupil;
        for (int i = 0; i < class1.length; i++) {
            newPupil = class1[i];
            boolean isDuplicate = false;
            for (int j = 0; j < pos; j++) {
                if (class3[j].equals(newPupil)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                class3[pos] = newPupil;
                pos++;
            }
        }

        for (int i = 0; i < class2.length; i++) {
            newPupil = class2[i];
            boolean isDuplicate = false;
            for (int j = 0; j < pos; j++) {
                if (class3[j].equals(newPupil)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                class3[pos] = newPupil;
                pos++;
            }
        }

        for (int i = 0; i < pos; i++) {
            System.out.println(class3[i]);
        }
    }
}
