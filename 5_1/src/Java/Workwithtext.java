package Java;
import java.io.*;
import java.nio.file.*;
import static java.lang.System.out;
/**
 * Created by 1 on 04.11.2015.
 */
public class Workwithtext {
        private static String Readfile (File file) throws Exception{
            StringBuilder inp = new StringBuilder();
            try  {
                FileReader reader = new FileReader(file);
                int content;
                while ((content=reader.read())!=-1){
                    inp.append ((char) content);
                }
                return inp.toString();
            }catch (FileNotFoundException filenotfound){
                throw new FileNotFoundException();
            }catch (IOException ioexceprion){
                throw new IOException();
            }catch (Exception exception){
                throw new Exception();
            }
        }

        static void Showfile (File file) throws Exception {
            try{
                out.println (Readfile(file));
            }catch (FileNotFoundException filenotfound){
                throw new FileNotFoundException();
            }catch (IOException ioexceprion){
                throw new IOException();
            }catch (Exception exception){
                throw new Exception();
            }
        }

        static void Createfile (File file, String text) throws Exception {
            try{
                FileWriter writer = new FileWriter(file, false);
                writer.write(text);
            } catch (FileAlreadyExistsException alreadyexist) {
                throw new FileAlreadyExistsException(file.toString());
            }catch (IOException ioexceprion){
                throw new IOException();
            }catch (Exception exception){
                throw new Exception();
            }
        }

        static void Writefile (File file, String text, boolean mode) throws Exception {
            try {
                FileWriter writer = new FileWriter(file, mode);
                writer.write(text);
            } catch (FileNotFoundException filenotfound){
                throw new FileNotFoundException();
            }catch (IOException ioexceprion){
                throw new IOException();
            }catch (Exception exception){
                throw new Exception();
            }
        }


}
