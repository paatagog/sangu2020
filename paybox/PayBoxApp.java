package paybox;

import paybox.Core;

public class PayBoxApp {

    public static void main(String[] args) {
        Core core = new Core();
        core.init();
        core.showHomeScreen();
        while (!core.needsShutDown()) {

        }
        core.shutDown();
    }
}
