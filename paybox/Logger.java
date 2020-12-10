package paybox;

import java.time.LocalDateTime;

public class Logger {
    public static void log(String eventText) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now + ": " + eventText);
    }
}
