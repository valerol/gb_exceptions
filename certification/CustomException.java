
package certification;

public class CustomException extends Exception {

    private int errorCode;

    public CustomException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public CustomException(String message, int errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public int getCode() {
        return this.errorCode;
    }

    public String toString() {
        return super.getMessage() + " Error code: " + getCode();
    }
}