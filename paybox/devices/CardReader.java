package paybox.devices;

/**
 * კლასი <code>CardReader<code/> განკუთვნილია ბარათების წამკითხავი მოწყობილობისთვის.
 */
public class CardReader {
    private boolean enabled = false;

    public void init() {
        // TODO დასამთავრებელია

        enabled = true;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}