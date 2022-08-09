package academy.tochkavhoda.colors.v3;

public enum ColorErrorCode {
    WRONG_COLOR_STRING,
    NULL_COLOR;

    String errorString;

    ColorErrorCode(String errorString) {
        this.errorString = errorString;
    }

    ColorErrorCode() {

    }

    public String getErrorString() {
        return errorString;
    }
}
