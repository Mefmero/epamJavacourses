package Java;

/**
 * Created by 1 on 02.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Filmscollection FavoriteMove = new Filmscollection();

        FavoriteMove.AddFilm("Watchmen", "Justice will overtake all of us", "Patrick Wilson ");
        FavoriteMove.AddFilm("Prometheus", "Some descriptions", "Patrick Wilson", "Charlize Theron ");
        FavoriteMove.AddFilm("Inception", "Your mind - the scene", "Leonardo DiCaprio");

        System.out.println(FavoriteMove);

        FavoriteMove.changeFilmActors("Inception", "Ellen Page");

        System.out.println(FavoriteMove);

        Inout.save(FavoriteMove);

        FavoriteMove = null;

        FavoriteMove = Inout.load();
        System.out.println(FavoriteMove);

    }
}
