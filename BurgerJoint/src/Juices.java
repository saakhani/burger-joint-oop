public class Juices extends Drink{
    public Juices(Size size, String flavour) {
        super(juiceDrink, flavour, size);

        //flavour can be Apple, Orange, Lemon
    }
    public String toString() {
        return flavour + " Juice " + super.toString();
    }
}
