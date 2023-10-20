package Product;

public class Burger extends Menu {
    public double[] price;

    public Burger(String name, String explain, double[] price,String[] option){
        this.name = name;
        this.explain = explain;
        this.price = price;
        this.option = option;
    }
}
