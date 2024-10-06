public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(123456, "Nguyen Van A");
        account1.deposit(100);
        account1.withdraw(50);
        account1.maturity();
        System.out.println(account1);

        Account account2 = new Account(654321, "Tran Thi B");
        account1.transferTo(account2, 20);
        System.out.println(account2);
    }
}