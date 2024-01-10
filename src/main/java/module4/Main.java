package module4;

public class Main {
    public static void main(String[] args) {
        BaseClass obj = new BaseClass();
        obj.printMessage();

        try{
            Thread.sleep(3000);
            CauseException causeException = new CauseException();
            CauseException.setZero();
            System.out.println("Zero="+causeException.getZero());
        } catch (ArithmeticException e) {
            System.out.println("You should not fail!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
