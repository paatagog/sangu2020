package paybox;

public class PayBoxApp {

    public static void main(String[] args) {
        Core core = new Core();
        try {
            core.init();
        } catch (PayBoxException pbe) {
            core.setDisabled(true);
            System.out.println(pbe.getText());
            pbe.printStackTrace();
            Logger.log(pbe.getText());
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
