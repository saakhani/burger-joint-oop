import java.util.*;

public abstract class Fries implements Prices{
    protected double price;
    protected Size size;
    protected ArrayList<Sauce> sauces = new ArrayList<Sauce>();

    public void addSauce(Sauce sauce){
        sauces.add(sauce);
    }

    public Fries(double price, Size size){
        this.price = price*size.getFactor();
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public double finalPrice(){
        double finalprice = 0;
        for (Sauce sauce: sauces){
            finalprice += sauce.getPrice();
        }
        return finalprice + price;
    }

    public String toString(){
        String temp = "";
        temp += this.size.toString() + ". Rs." + getPrice() +"\n";
        if (!sauces.isEmpty()){
            temp += "Sauces: ";
            for (Sauce sauce: sauces){
                temp += sauce + "(Rs. " + sauce.getPrice() + "), ";
            }
            temp += "Total Price: Rs." + finalPrice();
        }
        return temp;
    }
}
