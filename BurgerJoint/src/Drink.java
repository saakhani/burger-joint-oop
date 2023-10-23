public abstract class Drink implements Prices {
    protected double price;
    protected Size size;
    protected String flavour;

    public Drink(double price, String flavour, Size size){
        this.price = price*size.getFactor();
        this.flavour = flavour;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }
    
    public String toString(){
        String temp = "";
        temp += this.size.toString() + ". Rs." + getPrice() +"\n";
        return temp;
    }
}
