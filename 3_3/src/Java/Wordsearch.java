package Java;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.*;

public class Wordsearch {

    static StringBuilder text = new StringBuilder();

    static String stringPatternRis = "(\\([р|Р]ис.[\\s|\\S]\\d.?\\))|(\\([р|Р]ис.[\\s|\\S]\\d.+?\\))";
    static String stringPatternOffer = "(^|(?<=[.!?]\\s))(\\d+\\.\\s?)*[А-ЯA-Z][^!?]*?[.!?](?=\\s*(\\d+\\.\\s)*[А-ЯA-Z]|$)";
    static String stringPatternNumber = "\\d";
    static String stringPatternHtml ="(<[\\/\\!]*?[^<>]*?>)|\\&.+?\\;";

    static Pattern patternRis = Pattern.compile(stringPatternRis);
    static Pattern patternOffer = Pattern.compile(stringPatternOffer);
    static Pattern patternNumber = Pattern.compile(stringPatternNumber);
    static Pattern patternHtml = Pattern.compile(stringPatternHtml);


    public static void LoadFile() {
        String str = new String();
        try {
            FileReader in = new FileReader("src//Java.SE.03.Information handling_task_attachment.html");
            BufferedReader bufRead = new BufferedReader(in);
            while ((str = bufRead.readLine()) != null) {
                text.append(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void find() {
        int numberRis = Integer.MIN_VALUE;
        Matcher matcherRis = patternRis.matcher(text);
        Matcher matcherNumber;
        boolean sequenceIsBroken = false;
        String resultFind = "";

        while (matcherRis.find()) {
            resultFind = matcherRis.group();
            matcherNumber = patternNumber.matcher(resultFind);
            matcherNumber.find();
            if (!sequenceIsBroken) {
                if (numberRis > Integer.parseInt(matcherNumber.group())) {
                    sequenceIsBroken = true;
                } else {
                    numberRis = Integer.parseInt(matcherNumber.group());
                }
            }
        }

        if (sequenceIsBroken) out.println("Links to the picture is not consistent");
        else out.println("Links to figure consistent");
    }

    public static void group() {
        Matcher matcherRis;
        Matcher matcherHtml = patternHtml.matcher(text);
        String textWithoutHtml = matcherHtml.replaceAll("");
        Matcher matcherOffer = patternOffer.matcher(textWithoutHtml);

        while (matcherOffer.find()) {
            matcherRis = patternRis.matcher(matcherOffer.group());
            if(matcherRis.find()) {
                out.println(matcherOffer.group());
            }
        }
    }
}