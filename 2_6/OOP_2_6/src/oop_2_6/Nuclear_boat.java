package oop_2_6;
import static java.lang.System.out;
public class Nuclear_boat {
    int fueltank;
    String boatname;
    private Engine engine;

    Nuclear_boat(int fueltank, String boatname){
        this.fueltank = fueltank;
        this.boatname = boatname;
        engine = new Engine();
    }

    class Engine {
        public void startengine () {
            fueltank= fueltank -13;
            out.println("The engine was successfully launched");
        }
    }

    public void startboat (){
        engine.startengine();
        out.println ("The boat was successfully launched."
                + "Fuel capacity:"+fueltank);
    }
}
