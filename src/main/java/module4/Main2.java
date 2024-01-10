package module4;

public class Main2 {
    public static void main(String[] args){
        BaseClass obj = new BaseClass();
        obj.printMessage();

        try {
            CauseException causeException = new CauseException();
            CauseException.setZero();
            System.out.println("Zero="+causeException.getZero());
        } catch (Exception e) {
            System.out.println("You should never fail");
        }
    }
}
