package Product;

public class Beer extends Menu {
    public double[] price;

    public Beer(String name, String explain, double[] price,String[] option){
        this.name = name;
        this.explain = explain;
        this.price = price;
        this.option = option;
    }
}
