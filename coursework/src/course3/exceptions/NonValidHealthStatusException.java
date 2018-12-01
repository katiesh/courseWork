package course3.exceptions;

public class NonValidHealthStatusException extends Exception {
    public NonValidHealthStatusException() {
        super("Not within the required range");
    }
}
