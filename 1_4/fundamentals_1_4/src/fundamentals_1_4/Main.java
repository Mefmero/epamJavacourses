package fundamentals_1_4;
import static java.lang.System.*;
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        int a;
        double ans, max = 0.0d;
        Scanner keyboard = new Scanner (in);
        out.println ("Welcome! Type a and a[i]");
        try{
             a= Integer.parseInt(keyboard.next());
        }
        catch (Exception ex) {
             out.println("Error! It is not a number!");
             System.exit (0);
        }
        String str = keyboard.nextLine();
        String[] valuestr = str.split(" ");
        double[] value=new double [valuestr.length+1];
        for (int i=1; i<valuestr.length; i++)
        {
            try{
            value[i]=Double.parseDouble(valuestr[i]);
            }
            catch (NumberFormatException  e) {
              System.err.println("Error! It is not a number!");
            }
        }
        int n= valuestr.length;
       if (n%2==0){
            out.println ("Warning! You entered an array with an odd number of "
                    + "elements, the array will be extended 0 to a even number of "
                    + "elements. ");
            n=valuestr.length+1;
       }
       for (int i=1; i<=n/2; i++)
       {
            ans = value[i]+value[n-i];
            if (ans>max)
                max=ans;
       }
       out.println("Answer ="+ max);
    }

}
