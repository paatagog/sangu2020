package paybox.devices;

/**
 * კლასი <code>Printer<code/> განკუთვნილია საბეჭდი მოწყობილობისთვის.
 */
public class Printer {
    private boolean enabled = false;
    public void init() {
        // TODO დასამთავრებელია
        // throw new PayBoxException("Printer", "მოხდა პრინტერის შეცდომა" + "ქაღალდი არის დამთვრებული");

        enabled = true;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
