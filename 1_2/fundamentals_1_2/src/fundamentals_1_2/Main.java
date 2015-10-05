package fundamentals_1_2;
import static java.lang.System.*;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        double n=1.0, a=1.0, e=0.0;
        Scanner keyboard = new Scanner (in);
        out.println("--------------------------");
        out.println("Welcome! Type e.");
        try{
            e= Double.parseDouble(keyboard.next());
        }
        catch(Exception ex){
            out.println("Error! It is not a number!");
            System.exit (0);
        }
        out.println("--------------------------");
        out.println("Elements of sequence:");
        while (a >= e){
            a=1/pow(2,(n+1));
            n++;
            out.println(n + ". " + a);
        }
        out.println("--------------------------");
        out.println("Number of necessary terms of the sequence:");
        out.println(n);
    }
}
