package e_11_8;

public class TestAccount {
    // (int id, String name, double balance, double annualInterestRate)
    Account account;
    public TestAccount() {
        account = new Account(1122, "George", 1000, 1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(4);
        account.withdraw(3);
        account.withdraw(2);

        System.out.println(account);

    }
    public static void main(String[] args) {
        new TestAccount();
    }
}
