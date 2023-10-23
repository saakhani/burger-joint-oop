public abstract class Patty implements Prices{
    protected double price;

    public Patty(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
