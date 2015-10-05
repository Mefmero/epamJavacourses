/*
 * The project, implemented by the class notebook and write down in a notebook.
 */
package fundamentsla_1_6;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.ArrayList;
/**
 *Class in which to create a blank notepad and a test of
 * class methods writetonotepad
 */
public class notepad {
    static ArrayList notepad = new ArrayList();
    public static void main(String[] args) {
        int i=0,a=0;
        String str;
        Scanner keyboard = new Scanner (in);
        Scanner scunner = new Scanner (in);
        writetonotepad.addrecord("January");
        writetonotepad.addrecord("February");
        writetonotepad.addrecord("March");
        out.println("Welcome to Notepad! ");
        out.println("Type 1, if you want to view all records.");
        out.println("Type 2, if you want to remove record.");
        out.println("Type 3, if you want to add record.");
        out.println("Type 4, if you want to change record.");
        out.println("Type 5 to exit.");
        while (i != 5) {
           try{
             i= Integer.parseInt(keyboard.next());
            }
           catch (Exception ex) {
             out.println("Error! It is not a number!");
             System.exit (0);
            }
                if (i==1)
                    writetonotepad.viewall();
                if (i==2) {
                    out.println("Type a number of record, which you want to"
                            + " remove(The number does not exceed the number of"
                            + " elements in the notebook):");
                     try{
                     a= Integer.parseInt(keyboard.next());
                    }
                    catch (Exception ex) {
                    out.println("Error! It is not a number!");
                    System.exit (0);
                    }
                    writetonotepad.deleterecord(a);
                }
                if (i== 3){
                    out.println("Type a record:");
                    str = scunner.nextLine();
                    writetonotepad.addrecord(str);
                }
                if (i== 4){
                    out.println("Type a number of record, which you want to"
                            + " change(The index does not exceed the number "
                            + "of elements in the notebook):");
                    try{
                     a= Integer.parseInt(keyboard.next());
                    }
                    catch (Exception ex) {
                    out.println("Error! It is not a number!");
                    System.exit (0);
                    }
                    out.println("Type a record:");
                    str = scunner.nextLine();
                    writetonotepad.changerecord(str, a);
            
            }

        }
    }

}

class writetonotepad{
    /**
     * Add records
    */
    static void addrecord (String s){
        notepad.notepad.add (s);
    }
    /**
     * Delete records
    */
    static void deleterecord (int i){
        notepad.notepad.remove (i);
    }
    /**
     * Change records
    */
    static void changerecord (String s, int i){
        notepad.notepad.set (i, s);
    }
     /**
     * View all records
    */
    static void viewall (){
        for (int i=0; i<notepad.notepad.size(); i++)
            out.println(i+" - "+ notepad.notepad.get(i));
    }
}
