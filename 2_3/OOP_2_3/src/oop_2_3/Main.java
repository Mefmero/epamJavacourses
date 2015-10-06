package oop_2_3;
import static java.lang.System.out;
class stationery{
    private int price;
    private String color;

    public stationery(){}

    public stationery(int price, String color){
        this.color=color;
        this.price=price;
    }

    public String getinfo (){
        return (" Price: "+price+" Color: "+color);
    }
}

class notebook extends stationery{
     private int amountofpages;

     public notebook(){}

     public notebook(int price, String color, int amountofpages){
        super (price, color);
        this.amountofpages=amountofpages;
     }

     public String getinfo(){
        return (super.getinfo()+" Amount of pages: "+amountofpages);
     }
}

class pen extends stationery{
    private String producername;
    
    public pen(){}
    
    public pen(int price, String color, String producername ){
        super (price, color);
        this.producername=producername;
    }
    
    public String getinfo(){
        return (super.getinfo()+" Producer name :"+producername);
     }
}


public class Main {
    public static void main(String[] args) {
        notebook notebook1= new notebook (13, "red", 42 );
        pen pen1 = new pen (10, "blue", "pilot");
        out.println("Beginner set:");
        out.println ("Notebook: "+notebook1.getinfo());
        out.println ("Pen: "+pen1.getinfo());
    }
}
