1、 类名首字母建议大写，满足“驼峰模式”，不能用关键字，
    必须是合法标识符，且有意义。
2、  一个Java文件中可以定义多个class类，但只能一个类是public修饰,
    而且public修饰的类名必须成为代码文件名。
3、成员变量的完整定义格式是:
    修饰符数据类型变量名称=初始化值;一般无需指定初始化值，存在默认值。

默认值的规则:
        byte short int long         0
        double float                0.0
        boolean                     false
        string等引用类型              null
