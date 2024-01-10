public class Product extends Menu{

    Double price; // 상품가격

    Product(String name, Double price, String description){
        super(name, description); // 상속 받은 메뉴의 필드 (속성)
            this.price = price;
    }
}
