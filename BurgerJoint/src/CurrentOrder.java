public class CurrentOrder {
    static Order order;
    
    public static void initialise(){
        order = new Order();
    }

    public static Order getOrder() {
        return order;
    }
    
    
    
}
