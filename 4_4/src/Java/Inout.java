package Java;
import java.io.*;
/**
 * Created by 1 on 02.11.2015.
 */
public class Inout {
    public static void save(Filmscollection filmCollection) {
        try {
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream("Filmscollections"));
            Filmscollection fc = filmCollection;
            objOutput.writeObject(fc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Filmscollection load() {
        try {
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream("Filmscollections"));
            Filmscollection fc = (Filmscollection) objInput.readObject();
            return fc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}

