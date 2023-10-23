public class Milkshake extends Drink{
    public Milkshake(Size size, String flavour) {
        super(milkshakeDrink, flavour, size);

        //flavour can be Strawberry, Chocolate, Banana
    }
    public String toString() {
        return flavour + " Milkshake " + super.toString();
    }
}
