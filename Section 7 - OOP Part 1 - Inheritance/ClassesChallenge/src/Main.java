public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);
    }

}
