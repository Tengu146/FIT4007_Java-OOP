public class Account {
    private long accountNumber;
    private String accountName;
    private double balance;

    // Constructor mặc định
    public Account() {
        this.accountNumber = 0;
        this.accountName = "";
        this.balance = 0.0;
    }

    // Constructor đầy đủ tham số
    public Account(long accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Các phương thức getter và setter
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // Phương thức toString
    public String toString() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: " + balance;
    }
    //Hằng số
    private static final double INTEREST_RATE = 0.035;

    // Constructor với số tiền mặc định
    public Account(long accountNumber, String accountName) {
        this(accountNumber, accountName, 50.0);
    }

    // Phương thức nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0.");
        }
    }

    // Phương thức rút tiền
    public void withdraw(double amount) {
        double fee = 0.05; // Phí rút tiền
        if (amount > 0 && amount + fee <= balance) {
            balance -= amount + fee;
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }

    // Phương thức đáo hạn
    public void maturity() {
        balance += balance * INTEREST_RATE;
    }

    // Phương thức chuyển khoản
    public void transferTo(Account otherAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            otherAccount.deposit(amount);
        }
        else {
            System.out.println("Số tiền chuyển không hợp lệ.");
        }
    }


}