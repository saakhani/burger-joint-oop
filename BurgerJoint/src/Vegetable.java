
public abstract class Vegetable implements Prices {
    protected double price;

    public Vegetable(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
        public String toString(){
        return " (Rs. " + price + ")";
    }
}

