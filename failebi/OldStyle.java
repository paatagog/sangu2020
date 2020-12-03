package failebi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// ჯავას მე-6 ვერსიამდე ასე ხდებოდა ფაილებთან მუშობის შეცდომებთან გამკლავება
public class OldStyle {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("someFile.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("მოხდა შეტანა გამოტანის შეცდომა");
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println("ვერ მოხერხდა bufferedReader-ის დახურვა");
                ex.printStackTrace();
            }
        }
    }
}
