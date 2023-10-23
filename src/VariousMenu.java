import java.util.ArrayList;
import java.util.Scanner;

public class VariousMenu {
    Product product = new Product();
    Scanner sc = new Scanner(System.in);

    public int MainMenu(){
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Beers           | 맛있는 맥주");
        System.out.println("3. Frozen Custard  | 매일 매장에서 신선하게 직접 만드는 부드럽고 진한 맛의 아이스크림");
        System.out.println("4. Drinks          | 맛있는 음료수");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");

        return sc.nextInt();
    }

    public int selectMenu(int number){
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");

        if(number == 1){
            for(int i = 0; i < product.burgers.size(); i++) {

                System.out.println((i+1)+". " + product.burgers.get(i).name + "\t"
                        + "| " + product.burgers.get(i).explain);
            }
        }
        else if(number == 2){
            for(int i = 0; i < product.beers.size(); i++) {
                System.out.println((i+1)+". " + product.beers.get(i).name + "\t"
                        + "| " + product.beers.get(i).explain);
            }
        }
        else if(number == 3){
            for(int i = 0; i < product.frozens.size(); i++) {

                System.out.println((i+1)+". " + product.frozens.get(i).name + "\t"
                        + "| " + product.frozens.get(i).explain);
            }
        }
        else if(number == 4){
            for(int i = 0; i < product.drinks.size(); i++) {

                System.out.println((i+1)+". " + product.drinks.get(i).name + "\t"
                        + "| " + product.drinks.get(i).explain);
            }
        }
        return sc.nextInt()-1;
    }

    public void selectProduct(ArrayList<Order> orderlist, ArrayList<Double> totallist, int selectMenu,int selectProduct){
        Order order1 = new Order();
        int selectOption = selectOption(product, selectMenu, selectProduct);
        if(selectMenu == 1){
            System.out.println("\"" + product.burgers.get(selectProduct).name
                                    + "\t| W" + product.burgers.get(selectProduct).price[selectOption]
                                    + " | " + product.burgers.get(selectProduct).option[selectOption]
                                    + " | " + product.burgers.get(selectProduct).explain);
        }
        else if(selectMenu == 2){
            System.out.println("\"" + product.beers.get(selectProduct).name
                    + "\t| W" + product.beers.get(selectProduct).price[selectOption]
                    + " | " + product.beers.get(selectProduct).option[selectOption]
                    + " | " + product.beers.get(selectProduct).explain);
        }
        else if(selectMenu == 3){
            System.out.println("\"" + product.frozens.get(selectProduct).name
                    + "\t| W" + product.frozens.get(selectProduct).price[selectOption]
                    + " | " + product.frozens.get(selectProduct).option[selectOption]
                    + " | " + product.frozens.get(selectProduct).explain);
        }
        else if(selectMenu == 4){
            System.out.println("\"" + product.drinks.get(selectProduct).name
                    + "\t| W" + product.drinks.get(selectProduct).price[selectOption]
                    + " | " + product.drinks.get(selectProduct).option[selectOption]
                    + " | " + product.drinks.get(selectProduct).explain);
        }

        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        if (sc.nextInt() == 1){
            order1.ChooseMenu(selectMenu,selectProduct,selectOption);
            System.out.println(order1.getSelectMenu() + "를 장바구니에 추가했습니다.");
            orderlist.add(order1);
            totallist.add(order1.getSelectPrice());
            for(int i = 0; i < orderlist.size() - 1; i++){
                if(orderlist.get(i).getSelectMenu().equals(order1.getSelectMenu()) && orderlist.get(i).getSelectOption().equals(order1.getSelectMenu())){
                    orderlist.remove(orderlist.size() - 1);
                    orderlist.get(i).addNum();
                }
            }
        }
        else{
            System.out.println("장바구니에 추가하지 않았습니다.");
        }
    }

    public int selectOption(Product product, int selectMenu, int selectProduct){
        int optionNumber;
        if(selectMenu == 1){
            System.out.println(product.burgers.get(selectProduct).name + "의 옵션을 고르세요");
            for(int i = 0; i < product.burgers.get(selectProduct).option.length; i++) {
                System.out.print((i + 1) + ". " + product.burgers.get(selectProduct).option[i] + "("+product.burgers.get(selectProduct).price[i]+ ")" + "\t\t");
            }
        }else if(selectMenu == 2) {
            System.out.println(product.beers.get(selectProduct).name + "의 옵션을 고르세요");
            for(int i = 0; i < product.beers.get(selectProduct).option.length; i++){
                System.out.print((i + 1) + ". " + product.beers.get(selectProduct).option[i] + "("+product.beers.get(selectProduct).price[i]+ ")" + "\t\t");
            }
        }else if(selectMenu == 3){
            System.out.println(product.frozens.get(selectProduct).name + "의 옵션을 고르세요");
            for(int i = 0; i < product.frozens.get(selectProduct).option.length; i++){
               System.out.print((i + 1) + ". " + product.frozens.get(selectProduct).option[i] + "(" + product.frozens.get(selectProduct).price[i]+ ")" + "\t\t");
            }
        }else if(selectMenu == 4){
            System.out.println(product.drinks.get(selectProduct).name + "의 옵션을 고르세요");
            for(int i = 0; i < product.drinks.get(selectProduct).option.length; i++){
                System.out.print((i + 1) + ". " + product.drinks.get(selectProduct).option[i] + "(" + product.drinks.get(selectProduct).price[i]+ ")" + "\t\t");
            }
        }
        System.out.println();
        optionNumber = sc.nextInt();
        return optionNumber-1;
    }

    public void selectOrder(ArrayList<Order> orderlist, ArrayList<Double> totalPrice, ArrayList<Order> TodayOrder, double[] CurrentTotal, int[] waiting){
        double total = 0.0;
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");
        for(Order o : orderlist){
            o.OrderCheck();
        }
        System.out.println();
        for(int i = 0; i < totalPrice.size(); i++){
            total += totalPrice.get(i);
        }
        total = Math.round(total * 100)/100.0;
        System.out.println("[ Total ]");
        System.out.println("W " + total);

        System.out.println("1. 주문      2. 메뉴판");
        if (sc.nextInt() == 1){
            System.out.println("주문이 완료되었습니다!");
            System.out.println();
            waiting[0] = waiting[0] + 1;
            System.out.println("대기번호는 [ " + waiting[0] + " ] 번 입니다.");
            System.out.println("(3초 후 메뉴판으로 돌아갑니다.)");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            TodayOrder.addAll(orderlist);
            orderlist.clear();
            CurrentTotal[0] = CurrentTotal[0] + total;
            totalPrice.clear();
        }
    }

    public void selectCancel(ArrayList<Order> orderlist, ArrayList<Double> totalPrice){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        if(sc.nextInt() == 1){
            orderlist.clear();
            totalPrice.clear();
        }
    }

    public void secretMenu(ArrayList<Order> TodayOrder, double[] CurrentTotal){
        for(int i = 0; i < TodayOrder.size(); i++){
            while(TodayOrder.get(i).number > 1){
                TodayOrder.get(i).decreaseNum();
                TodayOrder.add(TodayOrder.get(i));
            }
        }
        System.out.println("오늘 판 목록은 다음과 같습니다.");
        for(int i = 0; i < TodayOrder.size(); i++){
            System.out.println(TodayOrder.get(i).getSelectMenu() + "\t" + "| " + TodayOrder.get(i).getSelectOption() + " | "
            + TodayOrder.get(i).getSelectPrice());
        }

        CurrentTotal[0] = Math.round(CurrentTotal[0] * 100)/100.0;

        System.out.println("------------------------------------");
        System.out.println("현재까지 총 판매된 금액은 [ " + CurrentTotal[0] + " ]원 입니다.");
        System.out.println();
        System.out.println("1. 돌아가기");
        sc.nextInt();
    }
}