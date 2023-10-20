public class Order {
    Product product = new Product();

    private String selectMenu;
    private String selectExplain;
    private double selectPrice;
    private String selectOption;

    public int number = 0;

    public void setSelectMenu(String Name){
        this.selectMenu = Name;
    }

    public String getSelectMenu(){
        return this.selectMenu;
    }

    public void setSelectExplain(String explain) {
        this.selectExplain = explain;
    }

    public String getSelectExplain() {
        return this.selectExplain;
    }

    public void setSelectPrice(double price) {
        this.selectPrice = price;
    }

    public double getSelectPrice() {
        return this.selectPrice;
    }

    public void setSelectOption(String option){
        this.selectOption = option;
    }

    public String getSelectOption(){
        return this.selectOption;
    }

    public void addNum(){
        number++;
    }

    public void decreaseNum(){
        number--;
    }
    public void ChooseMenu(int menuSelect, int productSelect,int selectOption) {
        if (menuSelect == 1) {
            setSelectMenu(product.burgers.get(productSelect).name);
            setSelectExplain(product.burgers.get(productSelect).explain);
            setSelectPrice(product.burgers.get(productSelect).price[selectOption]);
            setSelectOption(product.burgers.get(productSelect).option[selectOption]);
        } else if (menuSelect == 2) {
            setSelectMenu(product.beers.get(productSelect).name);
            setSelectExplain(product.beers.get(productSelect).explain);
            setSelectPrice(product.beers.get(productSelect).price[selectOption]);
            setSelectOption(product.beers.get(productSelect).option[selectOption]);
        } else if (menuSelect == 3) {
            setSelectMenu(product.frozens.get(productSelect).name);
            setSelectExplain(product.frozens.get(productSelect).explain);
            setSelectPrice(product.frozens.get(productSelect).price[selectOption]);
            setSelectOption(product.frozens.get(productSelect).option[selectOption]);
        } else if (menuSelect == 4) {
            setSelectMenu(product.drinks.get(productSelect).name);
            setSelectExplain(product.drinks.get(productSelect).explain);
            setSelectPrice(product.drinks.get(productSelect).price[selectOption]);
            setSelectOption(product.frozens.get(productSelect).option[selectOption]);
        }
        addNum();
    }

    public void OrderCheck(){
        System.out.println(this.selectMenu + "\t | W " +
                this.selectPrice + " | " + this.number + "개 | " +
                this.selectOption + " | "+ this.selectExplain);
    }
}
