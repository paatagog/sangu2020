package midterm.classsample;

import midterm.classsample.model.Person;
import midterm.classsample.model.Saministro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/***
 * ეს კლასი დაწერილია სპეციალურად შუალედური გამოცდისთვის.
 */
public class SaministroTester {

    public static void main(String[] args) {

        // ამ სიაში შევინახავთ სამინისტროებს
        List<Saministro> saministroebi = new ArrayList<>();

        // ეს არის პირველი სამინისტრო. კონსტრუქტორის საშუალებით შექმნის მომენტში გადავცეთ მას სახელი და მინისტრის ვინაობა.
        Saministro s = new Saministro("ჭამის სამინისტრო", new Person("ბეჟან", "ბეჟანიშვილი", 35, 54897456123L));

        // ამ სამინისტროში 35 თანამშრომელი დავამატოთ
        for (int i = 0; i < 35 ; i++) {
            s.addEmploy(new Person("სახელი" + i, "გვარი" + i,  20 + i, 54897456123L + i));
        }

        // შექმნილი სამინისტრო დავამატოთ სამინისტროების სიაში
        saministroebi.add(s);

        // მსგავსი მეთოდით, სამინისტროების სიას კიდევ რამდენიმე სამინისტრო დავამატოთ.
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            s = new Saministro("სამინისტრო " + r.nextInt(5000) , new Person("მინისტრის სახელი " + i, "მინისტრის გვარი " + i, 35 + i, 54897546123L + i));
            for (int j = 0; j < i + r.nextInt(20) ; j++) {
                s.addEmploy(new Person("სახელი" + j, "გვარი" + j,  20 + j, 54897456123L + j));
            }
            saministroebi.add(s);
        }

        // დავბეჭდოთ სამინისტროები
        for (Saministro sam: saministroebi) {
            System.out.println(sam);
        }

    }
}