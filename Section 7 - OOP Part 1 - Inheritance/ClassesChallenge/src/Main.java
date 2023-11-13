public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

        //Account bobsAccount = new Account("12345", 1000.00, "Bob Brown", "email@email.com", "(087) 123-4567");

        //bobsAccount.setNumber("12345");
        //bobsAccount.setBalance(1000.00);
        //bobsAccount.setCustomerName("Bob Brown");
        //bobsAccount.setCustomerEmail("email@email.com");
        //bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());
    }

}
