public class PersonOrdered {
    public static void main(String[] args) {
        // Call object and make another one
        OnlinePizzaOrder order1 = new OnlinePizzaOrder("Pepperoni","Large", 2, "8000, Davao City");
        OnlinePizzaOrder order2 = new OnlinePizzaOrder("Sausage","Medium", 4, "1500, SaPusoNiya");

        // Call placeOrderOnline
        order1.placeOrderOnline();
        System.out.println();
        order2.placeOrderOnline();
    }
}
