package oop_2_4;
import static java.lang.System.out;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
class stationery{
    private int price;
    private String producername;

    public stationery(){}

    public stationery(int price, String producername){
        this.producername=producername;
        this.price=price;
    }

     public int getPrice() {
             return price;
       }

     public String getName() {
             return producername;
       }

}

class notebook extends stationery{
     private int amountofpages;

     public notebook(){}

     public notebook(int price, String producername, int amountofpages){
        super (price, producername);
        this.amountofpages=amountofpages;
     }

}

class pen extends stationery{
    private String color;

    public pen(){}

    public pen(int price, String producername, String color){
        super (price, producername);
        this.color=color;
    }
}

class pencil extends stationery{
    private String size;

    public pencil(){}

    public pencil (int price, String producername, String size){
        super (price, producername);
        this.size=size;
    }
}
class sortedbyprice implements Comparator<stationery>{
    public int compare (stationery obj1, stationery obj2){
             int price1 = obj1.getPrice();
             int price2 = obj2.getPrice();

             if( price1 > price2 ){
                return 1;
             }

             else if (price1 < price2){
                return -1;
             }
            else {
                return 0;
            }
    }
}

 class sortedbyname implements Comparator<stationery> {

       public int compare(stationery obj1, stationery obj2) {

             String str1 = obj1.getName();
             String str2 = obj2.getName();

             return str1.compareTo(str2);
       }
}

public class Main {
    public static void main(String[] args) {
        stationery[] product = new stationery [3];
        product[0]= new notebook (12, "Diplomat", 42 );
        product[1] = new pen (7,"Pilot", "blue");
        product[2] = new pencil (42,"Constructor","huge");
        out.println("No sorted:");
        for (stationery i : product){
            out.println("Name:"+i.getName()+" "+"Price:"+i.getPrice());
        }
        out.println("Sorted by price:");
        Arrays.sort (product, new sortedbyprice());
        for (stationery i : product){
            out.println("Name:"+i.getName()+" "+"Price:"+i.getPrice());
        }
        out.println("Sorted by name:");
        Arrays.sort (product, new sortedbyname());
        for (stationery i : product){
            out.println("Name:"+i.getName()+" "+"Price:"+i.getPrice());
        }
    }
}
