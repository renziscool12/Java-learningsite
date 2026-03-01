
public class PizzaOrder { // Super Class (parent)
    // Protected Fields
    protected String pizzaType;
    protected String pizzaSize;
    protected int quantity;

    // Constructor
    public PizzaOrder(String pizzaType, String pizzaSize, int quantity) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.quantity = quantity;
    }

    // Method
    public void placeOrder() {
        System.out.println(quantity + " " + pizzaSize + " " + pizzaType + " pizza(s) ordered!");
    }
}

class OnlinePizzaOrder extends PizzaOrder { // Sub Class(child)
    // Private and Final so it won't change
    private final String deliveryAddress;

    // Constructor for child
    public OnlinePizzaOrder(String pizzaType, String pizzaSize, int quantity, String deliveryAddress) {
        // Inherit this from the parent
        super(pizzaType, pizzaSize, quantity);
        this.deliveryAddress = deliveryAddress;
    }


    // Method for child
    public void placeOrderOnline() {
        placeOrder();
        System.out.println("Deliver to: " + deliveryAddress);
        System.out.println("Order Confirmed! Ready to deliver. . .");
    }
}
