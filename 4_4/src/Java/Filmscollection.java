package Java;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * Created by 1 on 02.11.2015.
 */
public class Filmscollection implements java.io.Serializable {
    ArrayList <Film> Filmcollection;

    Filmscollection () {
        this.Filmcollection =  new ArrayList<Film>();
    }

    void AddFilm (String Filmname, String Description, String... Actors) {
        Filmcollection.add (new Film (Filmname,Description, Actors));
    }

    String Getfilm (String Filmname){
        for (Film film : Filmcollection) {
            if (film.GetFilmname().equals(Filmname)) return film.Getfilminfo();
        }
        return null;
    }

    void changeFilmDescription(String filmName, String description) {
        for (Film film : Filmcollection) {
            if (film.GetFilmname().equals(filmName)) {
                film.setDescription(new StringBuilder(description));
            }
        }
    }

    void changeFilmName(String filmName, String newFilmName) {
        for (Film film : Filmcollection) {
            if (film.GetFilmname().equals(filmName)) {
                film.setFilmname(newFilmName);
            }
        }
    }

    void changeFilmActors(String filmName, String... Actors) {
        for (Film film : Filmcollection) {
            if (film.GetFilmname().equals(filmName)) {
                film.setActor(Actors);
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder filmInfo = new StringBuilder();
        for (Film film : Filmcollection) {
            filmInfo.append(film);
        }
        return filmInfo.toString();
    }
}

