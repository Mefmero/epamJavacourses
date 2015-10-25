package IM_3_1;
import static java.lang.System.out;
/**
 * Created by 1 on 25.10.2015.
 */

public class Main {
    public static void main (String[] args){
        StringBuilder logger = new StringBuilder();
        logger.append ("13-06-1995 : 19-19-nothing happened; ");
        logger.append ("7-07-1999 : 21-20-Russia; ");
        logger.append ("12-11-2001 : 18-11-there are people; ");
        logger.append ("18-07-2003 : 08-53-empty message; ");
        logger.append ("19-07-2007 : 06-17-Hellow world!; ");
        out.println(logger);
        CrazyLogger.searchbydate(logger, "7-07-1999");
        CrazyLogger.searchbytime(logger, "08-53");


    }
}
