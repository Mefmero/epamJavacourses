package fundamental_1_3;
import static java.lang.System.*;
import java.util.Scanner;
import static java.lang.Math.tan;
public class Main {
    public static void main(String[] args) {
        double a=0.0, b=0.0, f=0.0, h=0.0;
        Scanner keyboard = new Scanner (in);
        out.println("Welcome! Type a, b and h");
        try{
             a= Double.parseDouble(keyboard.next());
        }
        catch (Exception ex) {
             out.println("Error! It is not a number!");
             System.exit (0);
        }
        try{
             b= Double.parseDouble(keyboard.next());
        }
        catch (Exception ex) {
             out.println("Error! It is not a number!");
             System.exit (0);
        }
        try{
             h= Double.parseDouble(keyboard.next());
        }
        catch (Exception ex) {
             out.println("Error! It is not a number!");
             System.exit (0);
        }
        out.println ("|    x       | f ");
        while (a<=b){
            f= tan (2*a) - 3;
            out.println("|    "+a+"     | "+f+" ");
            a+=h;
        }
    }

}
