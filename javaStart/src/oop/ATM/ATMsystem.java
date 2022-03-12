package oop.ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMsystem {
    public static void main(String[] args) {
        //定义账户类
        ArrayList<Account> list = new ArrayList<>();
        //展示页面
        while (true) {
            System.out.println("=======欢迎使用ATM机=======");
            System.out.println("请选择您的操作:");
            System.out.println("登录账户：1");
            System.out.println("注册账户：2");
            //
            Scanner sc = new Scanner(System.in);
            int act1 = sc.nextInt();
            switch (act1) {
                //登录
                case 1:
                    login(sc,list);
                    break;
                //注册
                case 2:
                    register(list, sc);
                    break;
                default:
                    System.out.println("您输入的操作命令不存在~~");

            }
        }
    }

    /**
     * 1.用户登录界面
     * @param sc  输入
     * @param list 集合
     */
    public static void login(Scanner sc,ArrayList<Account> list) {
        //判断集合中是否存在账户，如果不存在，登录功能不能执行
        if (list.size() != 0) {
            System.out.println("===========登录界面==============");
            while (true) {
                System.out.println("请输入账户id：");
                String id = sc.next();
                Account acc = getAccountById(list,id);
                if (acc != null) {
                    while (true) {
                        System.out.println("请输入密码：");
                        String pass = sc.next();
                        if (acc.getPassword().equals(pass)){
                            System.out.println("登录成功！" + acc.getName()+"先生/女士，您的卡号是：" + acc.getCardId());
                            //展示登陆后的页面
                            showUserCommand(list,acc,sc);
                            return;     //结束当前方法
                        }
                        else{
                            System.out.println("密码不正确，请重新输入！！");
                        }
                    }
                }
                else {
                    System.out.println("账户不存在！！");
                }
            }
        }
        else{
            System.out.println("对不起，当前系统中无任何账户，请先注册~~");
            return;         //卫语言风格，解决方法的执行
        }

    }

    /**
     * 用户操作界面
     * @param list  系统账户集合
     * @param acc   账户
     * @param sc    扫描器
     */
    private static void showUserCommand(ArrayList<Account> list,Account acc,Scanner sc) {
        while (true) {
            System.out.println("============用户操作界面===========");
            System.out.println("请选择您要执行的操作：");
            System.out.println("账户查询：1");
            System.out.println("存款：2");
            System.out.println("提取：3");
            System.out.println("转账：4");
            System.out.println("修改密码：5");
            System.out.println("注销账户：6");
            System.out.println("退出：7");
            System.out.println("请选择：");
            int act2 = sc.nextInt();
                switch (act2){
                    //账户查询
                    case 1:
                        showAccount(acc);
                        break;
                    //存款
                    case 2:
                        saveMoney(acc,sc);
                        break;
                    //提取
                    case 3:
                        drawMoney(acc,sc);
                        break;
                    //转账
                    case 4:
                        transfer(list,acc,sc);
                        break;
                    //修改密码
                    case 5:
                        revisePassword(acc,sc);
                        return;
                    //注销账户
                    case 6:
                        boolean flag = logout(acc,list,sc);
                        //注销成功，回到首页
                        if (flag)
                            return;
                        //注销未完成，留在此页面
                        else
                            break;
                    //退出
                    case 7:
                        System.out.println("退出成功~~");
        //                break;
                        return;     //结束当前方法
                    default:
                        System.out.println("没有此操作~~");
                }
        }
    }

    /**
     * (6)注销界面
     * @param acc   账户
     * @param list  系统账户
     * @param sc    扫描器
     */
    private static boolean logout(Account acc, ArrayList<Account> list,Scanner sc) {
        System.out.println("==========注销账户============");
        boolean flag = false;
        if (acc.getMoney() > 0){
            System.out.println("你当前账户还有余额，请先取出余额再进行注销！！");
            return flag;
        }
        else {
            while (true) {
                System.out.println("您确认要注销账户？");
                System.out.println("是：1");
                System.out.println("否：2");
                byte b = sc.nextByte();
                switch(b){
                    case 1:
                        while (true) {
                            System.out.println("输入密码，确认注销账户：");
                            String p = sc.next();
                            if (acc.getPassword().equals(p)){
                                list.remove(acc);
                                System.out.println("注销成功！！");
                                flag = true;
                                return flag;
                            }
                            else{
                                System.out.println("密码不正确！");
                                break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("当前账户继续保留！");
                        return flag;
                    default:
                        System.out.println("输入错误！");
                }
            }
        }

    }

    /**
     * (5)修改密码界面
     * @param acc 账户
     * @param sc 扫描器
     */
    private static void revisePassword(Account acc, Scanner sc) {
        System.out.println("===========修改密码界面================");
        System.out.println("请输入当前密码：");
        String p = sc.next();
        while (true) {
            if (acc.getPassword().equals(p)){
                System.out.println("请输入新的密码：");
                String p1 = sc.next();
                System.out.println("请确认新的密码：");
                String p2 = sc.next();
                if (p1.equals(p2)){
                    acc.setPassword(p1);
                    System.out.println("修改密码成功！！");
                    System.out.println("请重新登录~~");
                    return;
                }
                else{
                    System.out.println("两次密码不相同！！");
                }
            }
            else{
                System.out.println("您输入的密码不正确！！");
            }
        }
    }

    /**
     * (4)转账界面
     * @param list  系统账户集合
     * @param acc1  当前账户
     * @param sc    扫描器
     */
    private static void transfer(ArrayList<Account> list,Account acc1, Scanner sc ){
        System.out.println("===========转账界面==============");
        //判断系统账户数量
        if (list.size() < 2 ){
            System.out.println("系统中账户少于2个，无法转账~~");
            return;
        }
        else{
            //判断当前账户余额
            if (acc1.getMoney() < 100){
                System.out.println("你自己都没钱，先存点钱吧~~");
                return;
            }
            //输入对方id
            else{
                while (true) {
                    System.out.println("请输入对方卡号id：");
                    String id2 = sc.next();
                    Account acc2 = getAccountById(list,id2);
                    if (acc2 == null){
                        System.out.println("用户不存在！！请重新输入~~");
                    }
                    //卡号不能是自己的卡号
                    else if(acc1.getCardId().equals(acc2.getCardId())){
                        System.out.println("对不起，您不能给自己转账~~~");
                    }
                    else{
                        System.out.println("请确定对方户主姓氏：*" + acc2.getName().substring(1));
                        String na1 = sc.next();
                        String na2 = acc2.getName().substring(0,1);
                        if (na1.equals(na2)){
                            //转账
                            while (true) {
                                System.out.println("当前账户余额：" + acc1.getMoney() + "限额："+acc1.getQuotaMoney());
                                System.out.println("请输入转账金额：");
                                double money = sc.nextDouble();
                                //判断
                                if (money > acc1.getQuotaMoney()){
                                    System.out.println("转账金额大于当前限额！！限额为："+ acc1.getQuotaMoney());
                                }
                                else{
                                    //再判断
                                    if (money <= acc1.getMoney()) {
                                        acc1.setMoney(acc1.getMoney() - money);
                                        acc2.setMoney(acc2.getMoney() + money);
                                        System.out.println("转账成功~~");
                                        showAccount(acc1);
                                        return;
                                    }
                                    else {
                                        System.out.println("转账金额大于当前账户余额！！请重新输入");
                                    }
                                }
                            }
                        }
                        else{
                            System.out.println("输入有误！！");
                        }
                    }
                }
            }
        }
    }

    /**
     * (3)取款功能
     * @param acc   账户
     * @param sc    扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("==========取款功能=============");

        if (acc.getMoney() <= 0){
            System.out.println("您没有存款,先存点钱吧~~");
            return;     //结束当前方法
        }
        else{
            while (true) {
                System.out.println("当前账户余额：" + acc.getMoney() + "限额："+acc.getQuotaMoney());
                System.out.println("请输入取款金额：");
                double money = sc.nextDouble();
                //判断
                if (money > acc.getQuotaMoney()){
                    System.out.println("取款金额大于当前限额！！限额为："+acc.getQuotaMoney());

                }
                else{
                    //再判断
                    if (money <= acc.getMoney()) {
                        acc.setMoney(acc.getMoney() - money);
                        System.out.println("取款成功~~");
                        showAccount(acc);
                        break;
                    }
                    else {
                        System.out.println("取款金额大于当前账户余额！！请重新输入");
                    }
                }
            }
        }
    }

    /**
     * (2)用户存钱功能
     * @param acc 账户
     * @param sc 扫描器
     */
    private static void saveMoney(Account acc, Scanner sc) {
        System.out.println("======存钱功能=======");
        System.out.println("请输入存入金额：");
        double money = sc.nextDouble();
        //更新账户余额：原来的钱 + 新存入的钱
        acc.setMoney(money + acc.getMoney());
//        System.out.println("当前余额："+acc.getMoney());
        System.out.println("存钱成功！！");
        showAccount(acc);
    }

    /**
     * (1)账户信息展示
     * @param acc 账户
     */
    private static void showAccount(Account acc) {
        System.out.println("++++++++++账户信息如下++++++++++++");
        System.out.println("卡号id:" + acc.getCardId());
        System.out.println("户主:" + acc.getName());
        System.out.println("当前余额:" + acc.getMoney());
        System.out.println("限额:" + acc.getQuotaMoney());
        System.out.println("-=-=-=-=-=-=-=-==-=-=-=");
    }

    /**
     * 2.注册账户
     *
     * @param list 账户集合
     * @param sc 录入键盘
     */
    public static void register(ArrayList<Account> list, Scanner sc) {
        System.out.println("========系统开户操作=============");
        Account account = new Account();
        //输入账户姓名
        System.out.print("请输入您的姓名：");
        String name = sc.next();
        account.setName(name);
        //输入账户密码
        while (true) {
            System.out.println("请输入账户密码：");
            String p1 = sc.next();
            System.out.println("请确认账户密码：");
            String s2 = sc.next();
            if (p1.equals(s2)) {
                account.setPassword(p1);        //密码认证通过
                break;                          //结束死循环
            } else
                System.out.println("密码不匹配！！");
        }

        //限额
        System.out.println("请您输入当次限额");
        double quota = sc.nextDouble();
        account.setQuotaMoney(quota);

        //账户id
        String cardId = getCardId(list);
        account.setCardId(cardId);

        //把账户队形添加到账户集合里
        list.add(account);
        System.out.println("恭喜您" + name + "先生/女士，开户成功！您的卡号是" + cardId + "请妥善保管");
    }

    /**
     * 为账户生成8位不重复的卡号
     *
     * @return  id号码
     */
    public static String getCardId(ArrayList<Account> list) {
        Random r = new Random();
        String id = "";
        while (true) {
            for (int i = 1; i <= 8; i++)
                id += r.nextInt(10);
            //判断是否重复
            Account acc = getAccountById(list, id);
            if (acc ==null)
                return id;      //账户id可以使用
        }
    }

    /**
     * 根据卡号查询账户
     *
     * @param list 账户集合
     * @param id id
     * @return 账户对象
     */
    public static Account getAccountById(ArrayList<Account> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Account acc = list.get(i);
            if (acc.getCardId().equals(id))
                return acc;
        }
        return null;
    }
}
