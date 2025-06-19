package STREAMS_EXAMPLES;

public class MyCustomException extends Exception {

    // Default constructor
    public MyCustomException() {
        super();
    }

    // Constructor with custom message
    public MyCustomException(String message) {
        super(message);
    }

    // Constructor with message and cause
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor with cause only
    public MyCustomException(Throwable cause) {
        super(cause);
    }
}

