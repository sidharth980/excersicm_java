class CustomCheckedException extends Exception {

    CustomCheckedException() {
        super("Message");
        }

    CustomCheckedException(String message) {
        super(message);
    }

}
