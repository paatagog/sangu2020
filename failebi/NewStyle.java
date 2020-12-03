package failebi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// ფაილებთან მუშაობის ეს სტილი ჯავას მე-7 ვერსიიდან არის ძალაში
public class NewStyle {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("someFile.txt"))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("მოხდა შეტანა გამოტანის შეცდომა");
            ex.printStackTrace();
        }
    }
}
