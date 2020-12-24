package paybox;

public class PayBoxApp {

    public static void main(String[] args) {
        Core core = new Core();
        try {
            core.init();
        } catch (PayBoxException pbe) {
            String text = pbe.getType() + ": " + pbe.getMessage();
            core.setDisabled(true);
            System.out.println(text);
            pbe.printStackTrace();
            Logger.log(text);
        }
        if (core.isDisabled()) {
            core.showMessage("აპარატი დროებით არ მუშაობს");
        } else {
            core.showHomeScreen();
            while (!core.needsShutDown()) {
                // TODO ეს არის დროებით
                core.setNeedsShutDown(true);
            }
        }
        core.shutDown();
    }
}
