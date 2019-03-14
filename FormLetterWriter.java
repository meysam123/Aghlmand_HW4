public class FormLetterWriter {
    public static void displaySalutation(String LastName){
        System.out.println("Dear Mr./Ms."+ LastName);
        System.out.println("Thank you for your recent order");
    }
    public static void displaySalutation(String FirstName,String LastName){
        System.out.println("Greeting Dear "+FirstName+" "+LastName);
        System.out.println("Thank you for your recent order");
    }
}
