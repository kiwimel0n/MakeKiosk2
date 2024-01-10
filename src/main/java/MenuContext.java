import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuContext {
    private Map<String, List<Menu>> menus;    // 메뉴
    private Map<String, List<Product>> menuProduct;    // 상품메뉴
    private List<Product> cart;    // 장바구니
    private double totalPrice;    // 전체 가격
    private int orderNumber;    // 주문 번호

    public MenuContext() {
        menus = new HashMap<>();
        menuProduct = new HashMap<>();
        cart = new ArrayList<>();
        totalPrice = 0.0;
        orderNumber = 0;

        initializeMenuItems();    // 메뉴 및 상품메뉴 초기화
    }

    private void initializeMenuItems() {
        List<Menu> mainMenus = new ArrayList<>();
        mainMenus.add(new Menu("Burgers", "주문 즉시 바로 조리해 맛있는 맘스터치 버거~!"));
        mainMenus.add(new Menu("Chickens", "맘스터치만의 조리법으로 겉바속촉한 맘스터치 치킨~"));
        mainMenus.add(new Menu("SideAndSnack", "어떤 메뉴와도 어울려 먹을 수 있는 사이드메뉴"));
        mainMenus.add(new Menu("Drinks", "맘스터치 요리와 궁합인 음료수들"));

        List<Menu> orderMenus = new ArrayList<>();
        orderMenus.add(new Menu("Order", "장바구니를 확인 후 주문합니다."));
        orderMenus.add(new Menu("Cancel", "진행중인 주문을 취소합니다."));
        orderMenus.add(new Menu("Order List", "대기/완료된 주문목록을 조회합니다."));

        menus.put("Main", mainMenus); //메인메뉴라는 배열리스트 데이터를 key값이 Main으로 설정하고 menus의 Map 컬렉션에 넣는다.
        menus.put("Order", orderMenus); //주문메뉴라는 배열리스 데이터를 key값을 Order로 설정하고 menus의 Map 컬렉션에 넣는다.

        List<Product> burgersMenus = new ArrayList<>();
        burgersMenus.add(new Product("싸이버거", 4.6, "바삭하고 매콤한 치킨 패티와 신선한 양상추가 조화를 이루는 맘스터치 시그니처 버거"));
        burgersMenus.add(new Product("화이트갈릭버거", 5.2, "부드러운 화이트갈릭소스에 프리미엄 더블햄과 통가슴살 패티까지 담은 묵직한 버거"));
        burgersMenus.add(new Product("언빌리버블버거", 6.2, "통새우, 에그프라이, 통가슴살 패티에 매콤한 스리라차마요소스를 더한 대확행 버거"));
        burgersMenus.add(new Product("싸이플렉스버거", 7.7, "통다리살 싸이패티가 2장! 압도적 사이즈의 FLEX, 리얼 입찢버거 싸이플렉스버거"));
        burgersMenus.add(new Product("인크레더블버거", 5.7, "프리미엄 더블햄, 에그프라이, 통다리살 패티에 아삭아삭한 양상추와 양파까지 풍성한 버거"));

        List<Product> chickensMenus = new ArrayList<>();
        chickensMenus.add(new Product("후라이드싸이순살", 11.9, "케이준 양념 레시피로 더 바삭하고 스파이시한 닭다리살 순살치킨"));
        chickensMenus.add(new Product("맘스양념싸이순살", 13.9, "국내산 벌꿀 함유 매콤달콤 특제 양념소스의 닭다리살 순살치킨"));
        chickensMenus.add(new Product("간장마늘싸이순살", 13.9, "알싸한 마늘 향과 특제 간장소스의 닭다리살 순살치킨"));
        chickensMenus.add(new Product("치즈뿌치싸이순살(체다)", 13.9, "체다치즈맛 시즈닝과 싸이순살의 만남! 체다치즈의 고소함과 짭잘한 시즈닝이 중독적인 닭다리살 순살치킨"));


        List<Product> sideAndSnackMenus = new ArrayList<>();
        sideAndSnackMenus.add(new Product("케이준양념감자", 2.0, "케이준스타일의 바삭한 양념감자, 맘스터치의 베스트 사이드 메뉴"));
        sideAndSnackMenus.add(new Product("바삭크림치즈볼(4조각)", 3.7, "바삭하고 쫀득하게 즐기는 치즈볼"));
        sideAndSnackMenus.add(new Product("코울슬로", 1.8, "입맛을 돋우는 양배추의 아삭한 식감과 상큼한 맛의 코울슬로"));
        sideAndSnackMenus.add(new Product("콘샐러드", 1.8, "달콤한 스위트콘에 신선한 야채까지"));

        List<Product> drinksMenus = new ArrayList<>();
        drinksMenus.add(new Product("콜라", 2.0, "버거의 단짝! 기름끼를 내려줄 탄산량! 시원하게 한잔하세요"));
        drinksMenus.add(new Product("사이다", 2.0, "시원한 청량감으로 답답함을 내려줄 사이다"));
        drinksMenus.add(new Product("에이드", 3.5, "세가지 맛 이 있는 에이드를 골라주세요"));
        drinksMenus.add(new Product("커피", 2.5, "아메리카노입니다."));

        menuProduct.put("Burgers", burgersMenus);
        menuProduct.put("Chickens", chickensMenus);
        menuProduct.put("SideAndSnacks", sideAndSnackMenus);
        menuProduct.put("Drinks", drinksMenus);

    }


    //      메뉴 조회
//     @param key 조회할 메뉴 키값
//    @return 조회된 메뉴 목록
    public List<Menu> getMenus(String key) {
        return menus.get(key);
    }

    //    상품메뉴 조회
//	  @param key 조회할 상품메뉴 키값
//	  @return 조회된 상품메뉴 목록
    public List<Product> getMenuProducts(String key) {
        return menuProduct.get(key);
    }

    public Map<String, List<Product>> getMenuProductMap() {
        return menuProduct;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void addMenu(String key, String description) {
        menus.get("Main").add(new Menu(key, description));
        menuProduct.put(key, new ArrayList<>());
    }

    public void addMenuProduct(String key, Product newItem) {
        menuProduct.get(key).add(newItem);
    }

    public String getMainMenuName(int id) {
        List<Menu> mainMenus = menus.get("Main");
        for (Menu mainMenu : mainMenus) {
            if (mainMenu.id == id) {
                return mainMenu.name;
            }
        }
        return "";
    }

    // 장바구니에 상품메뉴 추가
    // @param menuProduct 장바구니에 추가할 상품메뉴
    public void addToCart(Product menuProduct) {
        cart.add(menuProduct);
        totalPrice += menuProduct.price;
    }

    // 장바구니 출력

    public void displayAllItem() {
        System.out.println("[ 전체 상품 목록 ]");
        menuProduct.forEach((key, value) -> {
            System.out.println(" [ " + key + " Menu ]");
            for (Product product : value) {
                System.out.println(product.id + ". " + product.name + "   | " + product.price + " | " + product.description);
            }
        });
    }

    public void displayCart() {
        for (Product product : cart) {
            System.out.println(product.name + "   | " + product.price + " | " + product.description);
        }
    }

    //장바구니 전체가격 조회
    //@return 장바구니 전체가격
    public double getTotalPrice() {
        return totalPrice;
    }

    // 신규 주문번호 조회
    // @return 신규 주문번호
    public int generateOrderNumber() {
        orderNumber++;
        return orderNumber;
    }

    // 장바구니 초기화

    public void resetCart() {
        cart.clear();
        totalPrice = 0.0;
    }
}
