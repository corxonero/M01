package es.egc.app;

import org.apache.log4j.*;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        log.info("Returning 1");
        System.out.println( "Hello World! Egc is beautiful" );
        Date d = new Date();
 		    System.out.println( "It's " + d );
    }

    public static int getVal(){
        return 1;
    }

    static Logger log=Logger.getLogger(App.class);
}
