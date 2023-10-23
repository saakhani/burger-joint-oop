import java.util.ArrayList;

public class Order {
    double price;

    ArrayList<Burger> burgers = new ArrayList<Burger>();
    ArrayList<Fries> fFries = new ArrayList<Fries>();
    ArrayList<Drink> drinks = new ArrayList<Drink>();

    public void addBurger(Burger burger){
        burgers.add(burger);
    }

    public void addFries(Fries fries){fFries.add(fries);}

    public void addDrink(Drink drink){drinks.add(drink);
    }

    public String getBurgers(){
        if (burgers.isEmpty()){
            return "";
        }
        else {
            String temp = "Burgers: \n";
            int count  = 1;
            for (Burger burger: burgers){
                temp += "Burger #" + count + ". Price (Rs. " + burger.getPrice() + ")\n";
            }
            return temp + "\n";
        }
    }
    public String getFries(){
        if (fFries.isEmpty()){
            return "";
        }
        else{
            String temp = "Fries: \n";
            int count = 1;
            for (Fries fries: fFries){
                temp += count + ". " + fries + "\n";
            }
            return temp + "\n";
        }
    }
    public String getDrinks(){
        if (drinks.isEmpty()){
            return "";
        }
        else{
            String temp = "Beverages: \n";
            int count = 1;
            for (Drink drink: drinks){
                temp += count + ". " + drink + "\n";
            }
            return temp + "\n";
        }
    }


    public double getFinalPrice() {
        for(Burger burger : burgers){
            price += burger.getPrice();
        }
        for(Fries fries : fFries){
            price += fries.finalPrice();
        }
        for(Drink drink: drinks){
            price += drink.getPrice();
        }

        return price;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    
    
    public String toString(){
        CurrentOrder.order.setPrice(0);
        CurrentOrder.order.getFinalPrice();
        return  getBurgers() +
                getFries() +
                getDrinks() +
                "Total: \nRs." + getPrice()
                ;
    }
}
