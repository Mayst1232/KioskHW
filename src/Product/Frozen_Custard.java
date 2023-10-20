package Product;

public class Frozen_Custard extends Menu {
    public double[] price;

    public Frozen_Custard(String name, String explain, double[] price,String[] option){
        this.name = name;
        this.explain = explain;
        this.price = price;
        this.option = option;
    }
}
