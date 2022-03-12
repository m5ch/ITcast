package oop.ATM;

//账户类
public class Account {
    //成员变量，私有
    private String name;        //姓名
    private String cardId;      //账户id
    private String password;    //密码
    private double money;       //账户余额
    private double quotaMoney;  //取现额度

    public Account() {

    }

    public Account(String name, String cardId, String password, double money, double quotaMoney) {
        this.name = name;
        this.cardId = cardId;
        this.password = password;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
