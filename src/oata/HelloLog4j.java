package oata;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class HelloLog4j {
    static Logger logger = Logger.getLogger(HelloLog4j.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Hello Log4j");
    }
}