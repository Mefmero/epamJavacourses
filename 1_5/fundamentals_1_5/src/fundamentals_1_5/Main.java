package fundamentals_1_5;
import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        int a=0;
        Scanner keyboard = new Scanner (in);
        out.println ("Welcome! Type a (size of array).");
        try{
            a=Integer.parseInt(keyboard.next());
        }
        catch(Exception ex){
            out.println("Error! It is not a number!");
        }
        int value[][]= new int [a][a];
            for (int i=0; i<a; i++)
            {
                for (int j=0; j<a; j++)
                {
                    if (j==i)
                        value[i][j]=1;
                    if (j==a-i-1)
                        value[i][j]=1;
                }
            }
        out.println("Your array:");
        for (int i=0; i<a; i++)
        {
            out.println();
             for (int j=0; j<a; j++)
                 out.print (value[i][j]+" ");
        }
    }
}



