import java.util.Arrays;
import java.util.List;

import Product.*;

public class Product {

    List<Burger> burgers = Arrays.asList(
            new Burger("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거", new double[]{6.9, 10.9}, new String[]{"Single", "double"}),
            new Burger("SmokeShack ", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", new double[]{8.9, 12.9}, new String[]{"Single", "double"}),
            new Burger("Shroom Burger ", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", new double[]{9.4}, new String[]{"Single"}),
            new Burger("Cheeseburger ", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", new double[]{6.9, 10.9}, new String[]{"Single", "double"}),
            new Burger("Hamburger ", "비프패티를 기반으로 야채가 들어간 기본버거", new double[]{5.4, 9.0}, new String[]{"Single", "double"})
    );

    List<Beer> beers = Arrays.asList(
            new Beer("ShakMeister Ale","쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", new double[] {9.8}, new String[]{"Single"}),
            new Beer("Magpie Brewing Co.","Pale Ale, Draft", new double[]{6.8}, new String[]{"Single"}),
            new Beer("Terra","Terra!! 아주 시원합니다.", new double[]{5.0}, new String[]{"Single"})
    );

    List<Frozen_Custard> frozens = Arrays.asList(
            new Frozen_Custard("Shakes", "바닐라,초콜렛,솔티드카라멜,블랙&화이트,스트로베리,피넛버터,커피", new double[]{5.9}, new String[]{"Single"}),
            new Frozen_Custard("Shake of the Week", "특별한 커스터드 플레이버", new double[]{6.5}, new String[]{"Single"}),
            new Frozen_Custard("Float", "루트 비어, 퍼플 카우, 크림시클", new double[]{5.9}, new String[]{"Single"})
    );

    List<Drink> drinks = Arrays.asList(
            new Drink("Shack-made Lemonade","매장에서 직접 만드는 상큼한 레몬에이드",new double[]{3.9}, new String[]{"Single"}),
            new Drink("Fresh Brewed IcedTea","직접 유기농 홍차를 우려낸 아이스티",new double[]{3.4}, new String[]{"Single"}),
            new Drink("Fifty/Fifty","레몬에이드와 아이스티의 만남",new double[]{3.5}, new String[]{"Single"})
    );
}