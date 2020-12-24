package paybox;

public class PayBoxException extends Exception {
    private String type;

    public PayBoxException (String type, String errorMessage) {
        super(errorMessage);
        this.type = type;
    }

    public String getText() {
        return this.type + this.getMessage();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
