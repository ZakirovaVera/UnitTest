package sem4.dummy;

public class Order {
    private int orderId;
    private String customerName;
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    // Сеттер для customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Геттеры для полей, если необходимо
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Конструктор, геттеры и сеттеры
}
