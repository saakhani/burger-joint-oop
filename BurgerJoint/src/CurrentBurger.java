public class CurrentBurger {
    
    public static Burger burger;
    
    public static void intialise(){
        burger = new Burger();
        burger.setBun(new Plain());
    }

    public static Burger getBurger() {
        return burger;
    }
    
    
    
}
