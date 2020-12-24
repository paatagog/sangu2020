package paybox;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import paybox.devices.CardReader;
import paybox.devices.CoinAcceptor;
import paybox.devices.Printer;
import paybox.gui.Gui;
import paybox.services.Service;
import paybox.services.ServiceCategory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Core {

    private static final String PAYBOX_CONF_FILE = "c:\\Users\\amigo\\IdeaProjects\\sangu2020\\paybox\\conf\\paybox.xml";
    private static final String SERVICE_CONF_FILE = "c:\\Users\\amigo\\IdeaProjects\\sangu2020\\paybox\\conf\\serviceconf.xml";

    private String id, address, supportNumber;
    private int screenWidth, screenHeight;

    private final CoinAcceptor coinAcceptor = new CoinAcceptor();
    private final CardReader cardReader = new CardReader();
    private final Printer printer = new Printer();

    private final Gui gui = new Gui();

    private final List<Service> services = new ArrayList<>();

    private Service selectedService = null;
    private ServiceCategory selectedServiceCategory = null;

    private boolean needsShutDown = false;
    private boolean disabled = false;

    public void init() throws PayBoxException {
        loadPayBoxConf(PAYBOX_CONF_FILE);
        gui.init(this);
        loadServices(SERVICE_CONF_FILE);
        printer.init();
        coinAcceptor.init();
        cardReader.init();
    }

    public void loadPayBoxConf(String fileName) throws PayBoxException{
        try {
            File conf = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(conf);
            doc.getDocumentElement().normalize();

            id = doc.getDocumentElement().getElementsByTagName("id").item(0).getTextContent();
            address = doc.getDocumentElement().getElementsByTagName("address").item(0).getTextContent();
            supportNumber = doc.getDocumentElement().getElementsByTagName("supportnumber").item(0).getTextContent();
            screenWidth = Integer.parseInt(doc.getDocumentElement().getElementsByTagName("screen_width").item(0).getTextContent());
            screenHeight = Integer.parseInt(doc.getDocumentElement().getElementsByTagName("screen_height").item(0).getTextContent());
        } catch (Exception ex) {
            throw new PayBoxException("confFile", "მოხდა კონფიგურაციის ფაილის წაკითხვის შეცდომა");
        }
    }

    public void loadServices(String fileName) throws PayBoxException {
        try {
            File conf = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(conf);
            doc.getDocumentElement().normalize();

            NodeList serviceNodes = doc.getDocumentElement().getElementsByTagName("service");
            for (int i = 0; i < serviceNodes.getLength(); i++) {
                Node serviceNode = serviceNodes.item(i);
                if (serviceNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element sElement = (Element) serviceNode;

                    Service s = new Service();
                    s.setState("enabled".equals(sElement.getAttribute("state")));
                    s.setName(sElement.getElementsByTagName("name").item(0).getTextContent());
                    s.setDescription(sElement.getElementsByTagName("description").item(0).getTextContent());
                    s.setLogo(sElement.getElementsByTagName("logo").item(0).getTextContent());
                    s.setPaymentUrl(sElement.getElementsByTagName("paymentUrl").item(0).getTextContent());
                    s.setVerificationUrl(sElement.getElementsByTagName("verifyUrl").item(0).getTextContent());

                    Node scNode = sElement.getElementsByTagName("category").item(0);
                    Element scElement = (Element) scNode;
                    ServiceCategory sc = new ServiceCategory();
                    sc.setName(scElement.getElementsByTagName("name").item(0).getTextContent());
                    sc.setDescription(scElement.getElementsByTagName("description").item(0).getTextContent());
                    sc.setLogo(scElement.getElementsByTagName("logo").item(0).getTextContent());

                    s.setCategory(sc);

                    services.add(s);
                }
            }
        } catch (Exception ex) {
            throw new PayBoxException("serviceFile", "მოხდა სერვისების ფაილის წაკითხვის შეცდომა");
        }
    }

    public void shutDown() {
        // TODO დასამთვრებელია
    }

    public void showHomeScreen() {
        gui.showHomeScreen();
        // TODO ეს შემდეგი სტრიქონი არის წასაშლელი
        gui.showService(services.get(0));
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

    public void payService() {

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

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public void showMessage(String message) {
        // TODO დასამთავრებელია
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }
}
