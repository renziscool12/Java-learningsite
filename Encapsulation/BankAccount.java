public class Main {
    public static void main(String[] args) {
        // call our object here
        Encapsulation bankAcc = new Encapsulation("12345", "Gojo", 1000);

        bankAcc.deposit(500); // add 500 to the balance
        bankAcc.withdraw(200); // withdraw 200
        bankAcc.setAccountHolder("Sukuna"); // change our name into Sukuna
        System.out.println(bankAcc.getBalance()); // print the balance
        System.out.println("The bank holder is: " + bankAcc.getAccountHolder()); // print the new bank holder now
    }
}
