package paybox.devices;

import paybox.PayBoxException;

/**
 * კლასი <code>CoinAcceptor<code/> განკუთვნილია ხურდის მიმღები მოწყობილობისთვის.
 */
public class CoinAcceptor {
    private boolean enabled = false;
    public void init() throws PayBoxException {
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
