package oop_2_5;
import static java.lang.System.out;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Group<Integer> Mathgroup = new Group (Lessons.MATH);
        Group<Double> Historygroup = new Group (Lessons.MATH);
        Group<Double> Physicsgroup = new Group (Lessons.MATH);
        Mathgroup.addstudent ("Ivanov Ivan");
        Mathgroup.addstudent ("Borisov Pavel");
        Mathgroup.addstudent ("Pushkin Sergei");

        Mathgroup.addmark ("Ivanov Ivan", 4);
        Mathgroup.addmark ("Borisov Pavel", 5);
        Mathgroup.addmark ("Pushkin Sergei", 5);


        Historygroup.addstudent ("Ivanov Ivan");
        Historygroup.addstudent ("Borisov Pavel");

        Historygroup.addmark ("Ivanov Ivan", 5.0);
        Historygroup.addmark ("Borisov Pavel", 3.2);


        Physicsgroup.addstudent ("Fazov Sergei");
        Physicsgroup.addstudent ("Borislov Albert");
        Physicsgroup.addstudent ("Borisov Pavel");

        Physicsgroup.addmark ("Fazov Sergei", 3.5);
        Physicsgroup.addmark ("Borislov Albert", 4.2);
        Physicsgroup.addmark ("Borisov Pavel", 4.7);

        Mathgroup.printgroup(Lessons.MATH);
        Historygroup.printgroup(Lessons.HISTORY);
        Physicsgroup.printgroup(Lessons.PHYSICS);


        out.println("List of Borisov Pavel's progress :");
        Mathgroup.searchforstudent ("Borisov Pavel", Lessons.MATH);
        Historygroup.searchforstudent ("Borisov Pavel",Lessons.HISTORY);
        Physicsgroup.searchforstudent ("Borisov Pavel",Lessons.PHYSICS);

    }
}
