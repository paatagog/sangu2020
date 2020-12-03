package paybox;

import paybox.devices.CardReader;
import paybox.devices.CoinAcceptor;
import paybox.devices.Printer;
import paybox.services.Service;
import paybox.services.ServiceCategory;

import java.util.List;

public class Core {

    private static final String PAYBOX_CONF_FILE = "paybox.xml";
    private static final String SERVICE_CONF_FILE = "serviceconf.xml";

    private String id, address, supportNumber;

    private CoinAcceptor coinAcceptor;
    private CardReader cardReader;
    private Printer printer;

    private List<Service> services;

    private Service selectedService = null;
    private ServiceCategory selectedServiceCategory = null;

    private boolean needsShutDown = false;

    public void init() {
        // TODO
        loadPayBoxConf(PAYBOX_CONF_FILE);
        loadServices(SERVICE_CONF_FILE);

        printer = new Printer();
        coinAcceptor = new CoinAcceptor();
        cardReader = new CardReader();

        printer.init();
        coinAcceptor.init();
        cardReader.init();



    }

    public void loadPayBoxConf(String fileName) {
        // TODO ამ ფუნქციამ კონფიგურაციის ფაილიდან უნდა წაიკითხოს ფეიბოქსის პარამეტრები
    }

    public void loadServices(String fileName) {
        // TODO ამ ფუნქციამ კონფიგურაციის ფაილიდან უნდა წაიკითხოს სერვისები
    }

    public void shutDown() {
        // TODO დასამთვრებელია
    }

    public void showHomeScreen() {
        // TODO დასამთავრებელია
    }

    public boolean needsShutDown() {
        return needsShutDown;
    }

    public void serviceSelected(String serviceName) {
        selectedService = null;
        for (var s: services) {
            if (s.getName().equals(serviceName)) {
                selectedService = s;
                break;
            }
        }
    }

    public String invoke(String url, String parameter) {
        // TODO დასამთავრებელია
        return null;
    }

    public String invoke(String url, String parameter1, String parameter2) {
        // TODO დასამთავრებელია
        return null;
    }

    public void verifyClientId(String clientId) {
        // TODO
        String result = invoke(selectedService.getVerificationUrl(), clientId);
    }

    public void payService(String clientId, double amount) {
        // TODO
        String result = invoke(selectedService.getVerificationUrl(), clientId, String.valueOf(amount));
    }

    public boolean isNeedsShutDown() {
        return needsShutDown;
    }

    public void setNeedsShutDown(boolean needsShutDown) {
        this.needsShutDown = needsShutDown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSupportNumber() {
        return supportNumber;
    }

    public void setSupportNumber(String supportNumber) {
        this.supportNumber = supportNumber;
    }
}
