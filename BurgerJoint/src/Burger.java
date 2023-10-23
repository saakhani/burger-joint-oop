import java.util.ArrayList;
public class Burger {
    private double price = 0;
    private Bun bun;
    private ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
    private ArrayList<Sauce> sauces = new ArrayList<Sauce>();
    private ArrayList<Patty> patties = new ArrayList<Patty>();



    public void addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }

    public void addSauce(Sauce sauce){
        sauces.add(sauce);
    }

    public void addPatty(Patty patty){
        patties.add(patty);
    }
    
    public void setBun(Bun bun){
        this.bun = bun;
    }

    public double getTotalPrice(){
        price += bun.getPrice();

        for (Patty patty : patties) {
            price += patty.getPrice();
        }

        for (Sauce sauce : sauces){
            price += sauce.getPrice();
        }

        for (Vegetable vegetable : vegetables){
            price += vegetable.getPrice();
        }

        return price;
    }

    public double getPrice() {
        return price;
    }

    public String getSauces(){
        if (sauces.isEmpty()){
            return "";
        }
        else{
        int ketchupCount = 0;
        int gMayoCount = 0;
        int hSauceCount = 0;
        int mustardCount = 0;
        int cheeseCount = 0;

        String temp = "\nSauces: \n";

        for (Sauce sauce: sauces){
            if (sauce.getClass().getName().contains("Ketchup")){
                ketchupCount++;
            }
            if (sauce.getClass().getName().contains("GarlicMayo")){
                gMayoCount++;
            }
            if (sauce.getClass().getName().contains("HotSauce")){
                hSauceCount++;
            }
            if (sauce.getClass().getName().contains("Mustard")){
                mustardCount++;
            }
            if (sauce.getClass().getName().contains("Cheese")){
                cheeseCount++;
            }
        }


        if (ketchupCount > 0){
            temp += ketchupCount + " Ketchup. (Rs. " + ketchupCount*Prices.ketchupSauce + ")\n";
        }
        if (gMayoCount> 0){
            temp += gMayoCount + " Garlic Mayo. (Rs. " + gMayoCount*Prices.garlicMayoSauce + ")\n";
        }
        if (hSauceCount > 0){
            temp += hSauceCount+ " Hot Sauce. (Rs. " + hSauceCount*Prices.hotSauceSauce+ ")\n";
        }
        if (mustardCount > 0){
            temp += mustardCount + " Mustard. (Rs. " + mustardCount*Prices.mustardSauce + ")\n";
        }
        if (cheeseCount > 0){
            temp += cheeseCount + " Cheese. (Rs. " + cheeseCount*Prices.cheeseSauce + ")\n";
        }

        return temp;
        }
    }
    public String getPatties(){
        if (patties.isEmpty()){
            return "";
        }
        else {
        int cChickenCount = 0;
        int gChickenCount = 0;
        int gBeefCount = 0;
        int tBaconCount = 0;
        String temp = "\nPatties: \n";
        for (Patty patty: patties){
            if (patty.getClass().getName().contains("CChicken")){
                cChickenCount++;
            }
            if (patty.getClass().getName().contains("GChicken")){
                gChickenCount++;
            }
            if (patty.getClass().getName().contains("GBeef")){
                gBeefCount++;
            }
            if (patty.getClass().getName().contains("Bacon")){
                tBaconCount++;
            }
        }


        if (cChickenCount > 0){
            temp += cChickenCount + " Crispy Chicken. (Rs. " + cChickenCount*Prices.cChickenPatty + ")\n";
        }
        if (gChickenCount > 0){
            temp += gChickenCount + " Grilled Chicken. (Rs. " + gChickenCount*Prices.gChickenPatty + ")\n";
        }
        if (gBeefCount > 0){
            temp += gBeefCount + " Grilled Beef. (Rs. " + gBeefCount*Prices.gBeefPatty + ")\n";
        }
        if (tBaconCount > 0){
            temp += tBaconCount + " Turkey Bacon. (Rs. " + tBaconCount*Prices.baconPatty + ")\n";
        }

        return temp;
        }
    }
    public String getVegetables(){
        if (vegetables.isEmpty()){
            return "";
        }
        else{
        int tomatoCount = 0;
        int icebergCount = 0;
        int oliveCount = 0;
        int onionCount = 0;
        int jalapenoCount = 0;
        String temp = "\nVegetables: \n";
        for (Vegetable vegetable: vegetables){
            if (vegetable.getClass().getName().contains("Jalapeno")){
                jalapenoCount++;
            }
            if (vegetable.getClass().getName().contains("Tomato")){
                tomatoCount++;
            }
            if (vegetable.getClass().getName().contains("Onion")){
                onionCount++;
            }
            if (vegetable.getClass().getName().contains("Olive")){
                oliveCount++;
            }
            if (vegetable.getClass().getName().contains("Iceberg")){
                icebergCount++;
            }
        }


        if (tomatoCount > 0){
            temp += tomatoCount + " Tomato. (Rs. " + tomatoCount*Prices.tomatoVegetable + ")\n";
        }
        if (icebergCount > 0){
            temp += icebergCount + " Iceberg. (Rs. " + icebergCount*Prices.icebergVegetable + ")\n";
        }
        if (oliveCount > 0){
            temp += oliveCount + " Olive. (Rs. " + oliveCount*Prices.oliveVegetable + ")\n";
        }
        if (onionCount > 0){
            temp += onionCount + " Onion. (Rs. " + onionCount*Prices.onionVegetable + ")\n";
    }
        if (jalapenoCount > 0){
            temp += jalapenoCount + " Jalapeno. (Rs. " + jalapenoCount*Prices.jalapenoVegetable + ")\n";
        }

        return temp;
        }
    }
    public String getBun(){
        return bun.toString();
    }
    
    @Override
    public String toString(){
        return "Bun: \n" + bun + ". (Rs." + bun.getPrice() + ")\n" +
                getPatties() +
                getVegetables() +
                getSauces() +
                "\nTotal: \nRs." + getTotalPrice()

                ;
        
    }




}
