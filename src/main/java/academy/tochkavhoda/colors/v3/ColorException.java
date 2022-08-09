package academy.tochkavhoda.colors.v3;

public class ColorException extends Exception {
    ColorErrorCode errorCode;

    public ColorErrorCode getErrorCode() {
        return errorCode;
    }
}
