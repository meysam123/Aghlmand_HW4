public class Main {
    public static void main(String[] args) {
        System.out.println("Test of First overloade Method:");
        Billing.computeBill(1200);
        System.out.println("\n");
        System.out.println("Test of Second overloade Method:");
        Billing.computeBill(1500,4);
        System.out.println("\n");
        System.out.println("Test of third overloade Method:");
        Billing.computeBill(1000,5,200);
        System.out.println("\n");
    }
}
