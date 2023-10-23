import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VariousMenu variousMenu = new VariousMenu();

        ArrayList<Order> orderList = new ArrayList<>();
        ArrayList<Order> TodayOrder = new ArrayList<>();
        ArrayList<Double> totalPrice = new ArrayList<>();
        double[] CurrentTotal = {0.0};

        int[] waiting = {0};


        while(true){
            int selectMenu = variousMenu.MainMenu();
            if(selectMenu > 0 && selectMenu < 5){
                int productNumber = variousMenu.selectMenu(selectMenu);
                variousMenu.selectProduct(orderList, totalPrice,selectMenu,productNumber);

            }
            else if(selectMenu == 5){
                variousMenu.selectOrder(orderList, totalPrice, TodayOrder, CurrentTotal, waiting);

            }
            else if(selectMenu == 6){
                variousMenu.selectCancel(orderList,totalPrice);
            }
            else if(selectMenu == 0){
                variousMenu.secretMenu(TodayOrder, CurrentTotal);
            }
            else if(selectMenu == 99){
                break;
            }
        }
    }
}


