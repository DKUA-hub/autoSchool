package module4;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {

    static Logger logger = LogManager.getLogger(BaseClass.class);

    public static void main(String[] args) {

    }

    private void printPrivate(){
        System.out.println("The message from private method");
        logger.debug("this is a debug log message");
        logger.info("this is a information log message");
        logger.warn("this is a warning log message");
    }

    public void printMessage(){
        System.out.println("Public message");
        printPrivate();
        logger.debug("this is a debug log message");
        logger.info("this is a information log message");
        logger.warn("this is a warning log message");
    }
}
