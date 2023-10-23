public abstract class Sauce implements Prices{
    protected double price;

    public Sauce(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
