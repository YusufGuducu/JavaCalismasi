public class Main {
    public static void main(String[] args) {
        CustomerInfo customer = new CustomerInfo();
        customer.setFullName("Yusuf GÜDÜCÜ");
        customer.setMail("yusuf123@priv.com");
        customer.setID("123456789");
        customer.setBalance(18792486);
        customer.setPassword("password123");

        System.out.println("Müşteri Bilgileri");
        System.out.println("İsim: "+customer.getFullName());
        System.out.println("ID: "+customer.getID());
        System.out.println("Mail Adres: "+customer.getMail());
        System.out.println("Bakiye: "+customer.getBalance());
    }
}