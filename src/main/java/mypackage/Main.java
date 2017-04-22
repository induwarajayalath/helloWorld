package mypackage;

import org.apache.log4j.Logger;


/**
 * this is my new
 * Created by root on 4/22/17.
 */
public class Main {

    static final Logger logger = Logger.getLogger(Main.class);
    private Main() {
    }

    public static void main(String[] args) {
        logger.info("This is error ");
    }
}