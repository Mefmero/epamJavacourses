package Java;
import java.io.*;
/**
 * Created by 1 on 02.11.2015.
 */
public class Wordprocessing {
    static StringBuilder str = new StringBuilder();

    static void ReadFile () {
        FileInputStream inp = null;
        BufferedReader bufread = null;
        try {
            inp = new  FileInputStream ("src//Java//Inp.txt");
            bufread = new BufferedReader (new InputStreamReader(inp, "UTF8"));
            int content;
            while ((content = bufread.read()) != -1){
                str.append((char) content);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            try{
                inp.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }
            try{
                bufread.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    static void WriteFile () {
        FileOutputStream out = null;
        BufferedWriter bufwrite = null;
        try{
            out = new FileOutputStream("src//Java//Out.txt");
            bufwrite = new BufferedWriter(new OutputStreamWriter(out, "UTF-16"));
            bufwrite.append(str.toString());
            bufwrite.flush();
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            try {
                bufwrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
