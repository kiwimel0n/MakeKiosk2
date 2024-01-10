import java.time.LocalDateTime;
import java.util.List;

public class Order {
    int orderNumber;
    String message;
    List<Product> cart;
    Double totalPrice;
    Boolean complete = false;
    LocalDateTime orderDate;
    LocalDateTime completeDate;

    public Order(int orderNumber, String message, List<Product> cart, Double totalPrice) {
        this.orderNumber = orderNumber;
        this.message = message;
        this.cart = cart;
        this.totalPrice = totalPrice;
        this.orderDate = LocalDateTime.now();
    }
    public int getOrderNumber() {
        return this.orderNumber;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
        this.completeDate = LocalDateTime.now();
    }

    public void display() {
        System.out.println("\t주문번호 : " + this.orderNumber);
        System.out.println("\t요구사항 : " + this.message);
        System.out.println("\t주문시각 : " + this.orderDate);
        System.out.println("\t주문상품 목록 : ");
        for (Product product: cart) {
            System.out.println("\t\t" + product.name + "   | " + product.price + " | " + product.description);
        }
        System.out.println("\t총 가격 : " + this.totalPrice);
    }
}
