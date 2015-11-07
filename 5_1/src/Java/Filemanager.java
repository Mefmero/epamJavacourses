package Java;
import java.io.*;
import java.nio.file.*;
import static java.lang.System.out;
/**
 * Created by 1 on 04.11.2015.
 */
public class Filemanager {
    File file;

    Filemanager() {
        file = new File(System.getProperty("user.dir"));
    }

    void Showcurrentdirectory() {
        out.println("Current directory is :" + file.toString());
    }

    void Updir() throws Exception {
        try {
            file = new File(file.getParent());
        } catch (NullPointerException nullPointerException) {
            Showcurrentdirectory();
            throw new NullPointerException("This is root directory!");
        } catch (Exception exception) {
            throw new Exception();
        }
    }

    void Downdir(String dir) throws Exception {
        try {
            file = new File(file.getPath() + "//" + dir);
            if (!file.isDirectory()) {
                file = new File(file.getParent());
                throw new NotDirectoryException(file.toString());
            } else {
                Showcurrentdirectory();
            }
        } catch (NullPointerException nullPointerException) {
            throw new NullPointerException();
        } catch (Exception exception) {
            throw new Exception();
        }
    }

    void Showfilesindir() {
        out.println("This directory includes next files:");
        for (File file : this.file.listFiles()) {
            out.println(file.getName());
        }
    }

    void Openfile(String filename) throws Exception {
        try {
            Workwithtext.Showfile(new File(file + "//" + filename));
        } catch (FileNotFoundException filenotfound) {
            throw new FileNotFoundException();
        } catch (IOException ioexceprion) {
            throw new IOException();
        } catch (Exception exception) {
            throw new Exception();
        }
    }

    void Writefile(String filename, String text, boolean mode) throws Exception {
        File workfile = new File(file + "//" + filename);
        if (!workfile.isFile()) throw new FileNotFoundException("File not found!");
        try {
            Workwithtext.Writefile(workfile, text, mode);
        } catch (FileNotFoundException filenotfound) {
            throw new FileNotFoundException();
        } catch (IOException ioexceprion) {
            throw new IOException();
        } catch (Exception exception) {
            throw new Exception();
        }
    }

    void Createfile(String filename, String text) throws Exception {
        File workfile = new File(file + "//" + filename);
        if (!workfile.isFile()) throw new FileNotFoundException("File not found!");
        try {
            Workwithtext.Createfile (workfile, text);
        } catch (FileAlreadyExistsException alreadyexist) {
            throw new FileAlreadyExistsException(file.toString());
        } catch (IOException ioexceprion) {
            throw new IOException();
        } catch (Exception exception) {
            throw new Exception();
        }
    }
}
