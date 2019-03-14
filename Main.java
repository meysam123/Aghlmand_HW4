public class Main {
    public static void main(String[] args) {
        Encrypt test=new Encrypt();
        test.setMessage("HI EVERYBODY! THIS IS A TEST");
        test.setCode(5);
        System.out.println(test.encryptAll());
    }
}
