package paybox.devices;

import paybox.PayBoxException;

/**
 * კლასი <code>CardReader<code/> განკუთვნილია ბარათების წამკითხავი მოწყობილობისთვის.
 */
public class CardReader {
    private boolean enabled = false;

    public void init() throws PayBoxException {
        // TODO დასამთავრებელია
        // throw new PayBoxException("CardReader", "მოხდა ბარათის წამკითხველის შეცდომა: " + "ბარათის ID არის არასწორი");
        enabled = true;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}