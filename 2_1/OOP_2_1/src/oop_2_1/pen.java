package oop_2_1;
import static java.lang.System.*;
public class pen {
    int price;
    String color;
    public pen(int price, String color){
        this.price=price;
        this.color=color;
    }

    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if (null==obj)
            return false;
        if (getClass()!=obj.getClass())
            return false;
        pen pen = (pen) obj;
        if (price != pen.price)
            return false;
        if (color != pen.color)
            return false;
        return true;
    }

    public int hashCode(){
        int result=31*price;
        return (result);
    }

    public String ToString(){
        return getClass().getName()+"@"+"price:"+price+"color:"+color;
    }
    public static void main(String[] args) {
        pen object1 = new pen (7, "red");
        pen object2 = new pen (7, "red");
        pen object3 = new pen (13, "green");
        out.println (object1.equals(object2));
        out.println (object1.equals(object3));
        out.println (object1.hashCode());
        out.println (object2.hashCode());
        out.println (object3.hashCode());
        out.println (object1.ToString());
    }
}
