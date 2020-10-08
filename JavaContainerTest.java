import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaContainerTest {

    public static void main(String[] args) {

        // ჩვეულებრივი მთელელემენტებიანი მასივის დემონსტრაცია
        // მასივიდან წავშალოთ მეორე ელემენტი
        int[] mteli = {4, 6, 13, 12, 57, 2, 3};
        int[] droebiti = new int[mteli.length - 1];

        for (int i = 0; i < 2; i++) {
            droebiti[i] = mteli[i];
        }
        for (int i = 2; i < droebiti.length; i++) {
            droebiti[i] = mteli[i+1];
        }
        mteli = droebiti;

        System.out.println("ეს არის უკვე წაშლილემენტიანი მასივი");
        for (int i = 0; i < mteli.length; i++) {
            System.out.print(mteli[i] + "; ");
        }
        System.out.println();
        System.out.println();

        // ეს არის სიის სადემონსტრაციო ფრაგმენტი
        // List<String> carieliSia = new ArrayList<>();
        List<String> sia = new ArrayList<>(Arrays.asList("მანქანა", "გემი", "მაგიდა", "უნივერსიტეტი", "გიორგი", "გიორგი"));

        System.out.println("ეს არის საწყისი სია");
        for (String s:sia) {
            System.out.print(s + "; ");
        }
        System.out.println();
        System.out.println();

        // წაშლის სიის მეორე ელემენტს
        sia.remove(2);

        System.out.println("ამ სიაში უკვე წაშლილია მეორე ელემენტი");
        for (String s:sia) {
            System.out.print(s + "; ");
        }
        System.out.println();
        System.out.println();

        sia.add("ტელეფონი");
        System.out.println("ამ სიაში დავამატეთ ახალი ელემენტი");
        for (String s:sia) {
            System.out.print(s + "; ");
        }
        System.out.println();
        System.out.println();

        System.out.println("სიის სიგრძეა - " + sia.size());
        System.out.println();

        sia.add(2, "კომპიუტერი");
        System.out.println("ამ სიაში მეორე ელემენტად დავამატეთ ახალი ელემენტი ");
        for (String s:sia) {
            System.out.print(s + "; ");
        }
        System.out.println();
        System.out.println();

        // TODO ამ ოპერატორზე კიდევ დავფიქრდეთ კარგად
        sia.remove("კომპიუტერი");
        System.out.println("ამ სიაში წავშალეთ კომპიუტერი");
        for (String s:sia) {
            System.out.print(s + "; ");
        }
        System.out.println();
        System.out.println();

        System.out.println("სიის მესამე ელემენტი არის - " + sia.get(2));

        sia.set(2, "ყუთი");
        System.out.println("სიის მეორე ელემენტი შევცვალეთ");
        System.out.println();

//        sia.clear();
//        System.out.println("სიაში წავშალეთ ყველა ელემენტი. ამ ეტაპზე სიის ზომა არის - " + sia.size());
//        System.out.println();

        List<Integer> mteliRicxvebisSia = new ArrayList<>();
        mteliRicxvebisSia.add(15);
        mteliRicxvebisSia.add(17);
        mteliRicxvebisSia.add(18);

        System.out.println("ამ სიაში არის ჩაწერილი მთელი რიცხვები Integer ობიექტების საშუალებით ");
        for (Integer i: mteliRicxvebisSia) {
            System.out.print(i + "; ");
        }
        System.out.println();
        System.out.println();

        // ამ ბრძანებით შესაძლებელია Java-ს სიმრავლის შექმნა
        // სიმრავლეში მხოლოდ განსხვავებული ელემენტები შეიძლება ეწეროს

        System.out.println("დავამატოთ სიმრავლე რამდენიმე ელემენტი, მათ შორის ერთნაირიც");
        // Set<String> simravle = new HashSet<>();
        Set<String> simravle = new LinkedHashSet<>();
        simravle.add("პაატა");
        simravle.add("გიორგი");
        simravle.add("ნიკა");
        simravle.add("ბექა");
        simravle.add("გიორგი");

        simravle.addAll(sia);

        System.out.println("სიმრავლე შემდეგი ელემენტებით დაკომპლექტდა");
        for (String s: simravle) {
            System.out.print(s + "; ");
        }
        System.out.println();
        System.out.println();

        System.out.println("isEmpty ოპერატორის მუშაობის შედეგი ჩვენი სიმრავლისთვის არის - " + simravle.isEmpty());

        System.out.println("contains(გიორგი) ბრძანების მუშაობის შედეგი ჩვენი სიმრავლისთვის არის - " + simravle.contains("გიორგი"));
        System.out.println();

        // Java-ში გვაქვს ასახვის (Map) ტიპის ობიექტიც
        // ასახვის თითოეული ელემენტი არის წყვილი.
        // წყვილის პირველი ნაწილი არის გასაღები, ხოლო მეორე ნაწილი არის მნიშვნელობა
        // გასაღებები არ მეორდება, ანუ სიმრავლეს (და არა სიას) წარმოადგენს
        // Map<String, String> asaxva = new HashMap<>();
        Map<String, String> asaxva = new LinkedHashMap<>();
        asaxva.put("პაატა", "გოგიშვილი");
        asaxva.put("მათე", "ასკილაშვილი");
        asaxva.put("გიორგი", "ყვავილაშვილი");
        asaxva.put("გიორგი", "გიორგაძე");
        asaxva.put("ნიკა", "ქებულაძე");

        System.out.println("ასახვაში გვაქვს შემდეგი ელემენტები:");
        for (Map.Entry<String, String> entry: asaxva.entrySet()) {
            System.out.println("გასაღები: " + entry.getKey() + "; " + "მნიშვნელობა: " + entry.getValue());
        }
        System.out.println();


        // Java-ს აქვს მასივებთან და კონტეინერებთან მუშაობის მოსახერხებელი საშუალება  - Arrays
        String[] masivi = {"ასაკი", "სახელი", "გვარი", "პირადი ნომერი"};
        List<String> damxmareSia = Arrays.asList(masivi);
        List<String> meoreSia = new ArrayList<>(damxmareSia);
        meoreSia.add(1, "თვალის ფერი");
        meoreSia.remove("პირადი ნომერი");
        meoreSia.add("უნივერსიტეტი");
        meoreSia.toArray(masivi);
        System.out.println("მასივში ელემენტების ჩასამატებლად და წასაშლელად სიის მოსახერხებელი ფუნქციებით ვისარგებლეთ:");
        for (String s: masivi) {
            System.out.println(s + "; ");
        }
        System.out.println();

    }
}
