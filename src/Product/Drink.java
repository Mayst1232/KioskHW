package Product;

public class Drink extends Menu {
    public double[] price;

    public Drink(String name, String explain, double[] price,String[] option){
        this.name = name;
        this.explain = explain;
        this.price = price;
        this.option = option;
    }
}