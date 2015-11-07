package Java;
import java.io.*;
import java.nio.file.*;
import static java.lang.System.*;
import java.util.Scanner;
/**
 * Created by 1 on 04.11.2015.
 */
public class Consolemanager {
    Filemanager filemanager;

    Consolemanager() {
        filemanager = new Filemanager();
    }

    private void helpwatchdir() {
        out.println("For watching files in directory type ls");
    }

    private void helpupdir() {
        out.println("For up directory type up");
    }

    private void helpinpac() {
        out.println("For come in folder type cd folder name ");
    }

    private void helpopenforread() {
        out.println("For open file for read type openr Filename.extension");
    }

    private void helpopentoappend() {
        out.println("For open file type openw Filename.extension text for append");
    }

    private void helpopenRewrite() {
        out.println("For open file to rewrite type openrw Filename.extension text for rewrite");
    }

    private void helpcreate() {
        out.println("To create file type create Filename.extension or  create folder name");
    }

    private void helpexit() {
        out.println("To exit type exit");
    }

    private void helphelp() {
        out.println("To see help type help");
    }

    private void helpinfo() {
        helpwatchdir();
        helpinpac();
        helpcreate();
        helpupdir();
        helpopenforread();
        helpopenRewrite();
        helpopentoappend();
        helpexit();
    }


        void Console() {
        String[] command;
        String enterText = "";
        helpinfo();
        try (Scanner scanner = new Scanner(in)) {
            do {
                try {
                    enterText = scanner.nextLine();
                } catch (Exception e) {
                    out.println("Error!");
                    out.println(e.getMessage());
                }
                command = enterText.split(" ");
                switch (command[0]) {
                    case "ls": {
                        filemanager.Showfilesindir();
                        break;
                    }
                    case "up": {
                        up();
                        break;
                    }
                    case "cd": {
                        inpac(command[1]);
                        break;
                    }
                    case "openr": {
                        openr(command[1]);
                        break;
                    }
                    case "openw": {
                        openw(command);
                        break;
                    }
                    case "openrw": {
                        openrw(command);
                        break;
                    }
                    case "create": {
                        create(command);
                        break;
                    }
                    case "help": {
                        helpinfo();
                        break;
                    }
                    case "exit": {
                        break;
                    }
                    default:
                        out.println("Command not found!!!");
                }
            } while (!enterText.equals("exit"));
        }
    }


    private void up() {
        try {
            filemanager.Updir();
            filemanager.Showcurrentdirectory();
        } catch (NullPointerException nullPointerException) {
            out.println(nullPointerException.getMessage());
            helpwatchdir();
            helpinpac();
            helphelp();
        } catch (Exception e) {
            out.println(e.getMessage());
            helpinfo();
        }
    }

    private void inpac(String s) {
        try {
            if (s == null) {
                helpinfo();
            } else {
                filemanager.Downdir(s);
            }
        } catch (NotDirectoryException notDirException) {
            out.println("Directory is not exist!");
            helpwatchdir();
            helpinpac();
            helphelp();
        } catch (NullPointerException nullPException) {
            out.println(nullPException.getMessage());
            helpinfo();
        } catch (Exception e) {
            out.println(e.getMessage());
            helpinfo();
        }
    }

    private void openr(String fileName) {
        try {
            filemanager.Openfile(fileName);
        } catch (FileNotFoundException fNotFound) {
            out.println("File is not exist!");
            helpwatchdir();
            helpcreate();
            helpopenforread();
            helpopenRewrite();
            helpopentoappend();
        } catch (IOException ioException) {
            out.println("Read error!");
            helpinfo();
        } catch (Exception e) {
            out.println(e.getMessage());
            helpinfo();
        }
    }

    private void openw(String[] command) {
        try {
            filemanager.Writefile(command[1], TextForWrite(command), true);
            out.println("Record added!");
        } catch (FileNotFoundException fNotFound) {
            out.println(fNotFound.getMessage());
            helpwatchdir();
            helpcreate();
        } catch (IOException ioException) {
            out.println("Read error!");
            helpinfo();
        } catch (Exception e) {
            out.println(e.getMessage());
            helpinfo();
        }
    }

    private void openrw(String[] command) {
        try {
            filemanager.Writefile(command[1], TextForWrite(command), false);
            out.println("Record recreated");
        } catch (FileNotFoundException fNotFound) {
            out.println(fNotFound.getMessage());
            helpwatchdir();
            helpcreate();
        } catch (IOException ioException) {
            out.println("Read error!");
            helpinfo();
        } catch (Exception exception) {
            out.println(exception.getMessage());
            helpinfo();
        }
    }

    private void create(String[] command) {
        try {
            filemanager.Createfile(command[1], TextForWrite(command));
            out.println("File with record created!");
        } catch (FileAlreadyExistsException fAlreadyExist) {
            out.println("Τΰιλ " + fAlreadyExist.getMessage() + " already exist!");
            helpwatchdir();
            helpopenforread();
            helpopenRewrite();
            helpopentoappend();
        } catch (IOException ioException) {
            out.println("Read error!");
            helpinfo();
        } catch (Exception e) {
            out.println(e.getMessage());
            helpinfo();
        }
    }

    private String TextForWrite(String... command) {
        StringBuilder textForWrite = new StringBuilder();
        for (int i = 2; i < command.length; i++) {
            textForWrite.append(command[i] + " ");
        }
        return textForWrite.toString();
    }
}

