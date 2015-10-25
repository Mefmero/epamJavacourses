package IM_3_1;
import static java.lang.System.out;
/**
 * Created by 1 on 25.10.2015.
 */
public class CrazyLogger {
    static void searchbydate(StringBuilder log, String data) {
        if (log.indexOf(data) != -1) {
            out.println("Your message: " + log.substring(log.indexOf(data), log.indexOf(";", log.indexOf(data)) + 1));
        } else {
            out.println("Not found!");
        }
    }

    static void searchbytime(StringBuilder log, String time) {
        if (log.indexOf(time) != -1) {
            out.println("Your message: " + log.substring(log.indexOf(time) - 13, log.indexOf(";", log.indexOf(time)) + 1));
        } else {
            out.println("Not found!");

        }
    }
}
