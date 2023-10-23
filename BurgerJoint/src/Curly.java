public class Curly extends Fries {
    public Curly(Size size) {
        super(curlyFries, size);
    }

    public String toString(){
        return "Curly " + super.toString();
    }
}