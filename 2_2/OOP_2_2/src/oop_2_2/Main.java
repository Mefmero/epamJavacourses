package oop_2_2;
import static java.lang.System.out;
class inventory{
    int numberpen, numbernotebook, numberpencil;
    int pricepen=7, pricenotebook=13, pricepencil=42;
    public inventory (int numberpen, int numbernotebook, int numberpencil){
        this.numbernotebook=numbernotebook;
        this.numberpen=numberpen;
        this.numberpencil=numberpencil;
    }
    public int cost()
    {
     return (pricepen*numberpen+pricenotebook*numbernotebook
             +pricepencil*numberpencil);
    }
}

public class Main {
    public static void main(String[] args) {
        inventory student1 = new inventory (2, 3, 4);
        inventory student2 = new inventory (15, 16, 20);
        out.println (student1.cost());
        out.println (student2.cost());
    }
}
