package module4;

public class CauseException {
    public static int zero = 0;
    public static void main(String[] args) {
        zero = 5/0;
    }

    public static void setZero() {
        zero = 5/0;
    }

    public int getZero() {
        return zero;
    }
}
