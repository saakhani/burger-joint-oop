public class Water extends Drink{
    public Water(Size size, String flavour){
        super(waterDrink,flavour,size);

        //flavour can be Room Temp or Chill
    }
    public String toString() {
        return flavour + " Water " + super.toString();
    }
}
