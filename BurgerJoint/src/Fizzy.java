public class Fizzy extends Drink{
    public Fizzy(Size size, String flavour) {
        super(fizzyDrink, flavour, size);

    }


    public String toString() {
        return flavour + " " + super.toString();
    }
}
