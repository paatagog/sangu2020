package paybox.devices;

/**
 * კლასი <code>Printer<code/> განკუთვნილია საბეჭდი მოწყობილობისთვის.
 */
public class Printer {
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
