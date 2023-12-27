class CustomUncheckedException extends RuntimeException {

    CustomUncheckedException() {
        super("Message");
    }

    CustomUncheckedException(String message) {
        super(message);
    }

}
