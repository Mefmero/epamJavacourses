package Java;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by 1 on 01.11.2015.
 */
public class Wordprocessing {
    static StringBuilder str = new StringBuilder();
    static String patternKeyWords = "byte|short|int|long|float|double|char|boolean|do|while|for|break|continue|else|" +
            "switch|case|default|break|private|public|protected|final|static|abstract|synchronized|volatile|strictfp" +
            "|false|true|null|return|void|package|import|try|catch|finally|throw|throws|new|extends|implements|class|" +
            "instanceof|this|super";
    static String result = "";

    public static  void ReadFile () {
        FileReader inp = null;
        try {
            inp = new FileReader("src//Java//WordProcessing.java");
            int content;
            while ((content = inp.read()) != -1) {
                str.append((char) content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inp.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    public static void FindandPrint () {
        Pattern pattern = Pattern.compile(patternKeyWords);
        Matcher matcher = pattern.matcher (str);
        FileWriter out = null;
        try{
            while (matcher.find()){
                result += str.substring(matcher.start(), matcher.end()) + " ";
            }
            out = new FileWriter ("src//Java//Output.txt");
            out.write(result);
        } catch (Exception e)       {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

}

