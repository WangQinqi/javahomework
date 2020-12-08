import java.util.Date;
public class Account {
    // 成员变量
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // 无参构造函数
    public Account() {
        dateCreated = new Date();
    }
    // 有参构造函数
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    // id访问器
    public int getId() {
        return id;
    }
    // id修改器
    public void setId(int id) {
        this.id = id;
    } 

    // balance访问器
    public double getBalance() {
        return balance;
    }
    // balance修改器
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // annualInterestRate访问器
    public double getAIR() {
        return annualInterestRate;
    }
    // annualInterestRate修改器
    public void setAIR(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // dateCreated访问器
    public Date getDateCreated() {
        return dateCreated;
    }

    // 返回月利率
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    // 返回月利息
    public double getMonthlyInterest() {
        double rate = getMonthlyInterestRate();
        return rate * balance / 100;
    }

    // 取款
    public void withDraw(double amount) {
        balance -= amount;
    }
    // 存款
    public void deposit(double amount) {
        balance += amount;
    }

    // 测试函数
    public static void main(String args[]) {
        Account account = new Account(1122, 20000);
        account.setAIR(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("余额：" + account.getBalance() + "\n" + "月利息：" + account.getMonthlyInterest() + "\n" + "开户日期：" + account.getDateCreated());
    }
}