package shecdomebi;

public class SanguException extends Exception {
    String errorType;

    public SanguException(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }
}
