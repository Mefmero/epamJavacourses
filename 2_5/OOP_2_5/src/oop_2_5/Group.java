package oop_2_5;
import java.util.*;
import static java.lang.System.out;
public class Group <T extends Number> {
    public Lessons lesson;
    Map<String, T> group;
    Map<T, Lessons> personalgroup= new TreeMap<T, Lessons>();

    public Group () {};
    
    public Group (Lessons lessonname){
        group = new HashMap<String, T>();
        lesson = lessonname;

    }

    public Lessons getgroupname (){
        return lesson;
    }

    public void addstudent (String studentname){
        group.put (studentname, null);
    }

    public void addmark (String studentname, T mark){
        group.put (studentname, mark);
    }

    public void printgroup (Lessons lessonname){
        out.println(lessonname+": ");
        Set<Map.Entry<String, T>> set = group.entrySet();
        for (Map.Entry<String, T> me: set){
            out.print (me.getKey()+": ");
            out.println (me.getValue());
        }
    }

    public void searchforstudent (String studentname, Lessons lessonname){
        T mark = group.get(studentname);
        if (mark!= null){
            out.println(lessonname+" :"+ mark);
        }

    }


}
