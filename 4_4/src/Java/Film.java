package Java;
import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.ArrayList;
/**
 * Created by 1 on 02.11.2015.
 */
public class Film implements java.io.Serializable {
    String Filmname;
    ArrayList <String> Actors;
    StringBuilder Description;

    Film (){
        this.Filmname = new String() ;
        this.Description = new StringBuilder();
        this.Actors = new ArrayList<String>();
    }

    Film (String Filmname,String Description, String... Actors ){
        this.Filmname = new String() ;
        this.Description = new StringBuilder();
        this.Actors = new ArrayList<String>();
        SetFilm (Filmname, Description, Actors );
    }

    String GetFilmname () {
        return Filmname;
    }

    void SetFilm (String Filmname, String Description,  String... Actors) {
        this.Filmname = Filmname;
        this.Description.append(Description);
        for (String actor : Actors) {
            this.Actors.add(actor);
        }
    }

    void setDescription (StringBuilder Description){
        this.Description = Description;
    }

    void setFilmname (String Filmname) {
        this.Filmname = Filmname;
    }

    void setActor ( String... Actors){
        for (String actor : Actors) {
            this.Actors.add(actor);
        }
    }

    @Override
    public String toString() {
        StringBuilder filmInfo = new StringBuilder();
        filmInfo.append("Film: "+ this.Filmname);
        filmInfo.append('\n');
        for (String actor : Actors) filmInfo.append("Actor: " + actor + ", ");
        filmInfo.append('\n');
        filmInfo.append("Description: " + Description);
        filmInfo.append('\n');
        return filmInfo.toString();
    }

    String Getfilminfo (){
        return this.toString();
    }
}
