package ua.mamedov;

/**
 * Класс для описания результата операции/запроса
 */
public class ResponseStatus {

    private int status;

    private String message;

    public ResponseStatus() {
    }

    public ResponseStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "ResponseStatus{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
