public enum Size {
    LARGE(1.5), MEDIUM(1), SMALL(0.75);


    private double factor;

    private Size(double factor){
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
    
    public String toString(){
        return this.name();
    }
}
