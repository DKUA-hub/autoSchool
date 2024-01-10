package module4;

public class CauseException2{
    public static int zero = 0;
    public static void main(String[] args)  throws ArithmeticException{
        zero = 5/0;
    }

    public static void setZero() throws ArithmeticException{
        zero = 5/0;
    }

    public int getZero() {
        return zero;
    }
}
