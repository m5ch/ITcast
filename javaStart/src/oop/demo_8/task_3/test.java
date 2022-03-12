package oop.demo_8.task_3;

import java.util.ArrayList;
import java.util.Scanner;

/*
    案例:学生信息系统:展示数据，并按照学号完成搜索学生类信息（学号，姓名，性别，班级>
    测试数据:
    "20180302"，"叶孤城"，23，"护理一班”
    "20180303","东方不败”，23,"推拿二班"
    "20180304","西门吹雪”,26,"中药学四班”
    "20180305"，"梅超风”, 26，”神经科2班”
 */
public class test {
    public static void main(String[] args) {
        //1.定义学生类
        //2.创建学生对象
        Student s1 = new Student("20180302", "叶孤城", 23, "护理一班");
        Student s2 = new Student("20180303", "东方不败", 23, "推拿二班");
        Student s3 = new Student("20180304", "西门吹雪", 26, "中药学四班");
        Student s4 = new Student("20180305", "梅超风", 26, "神经科2班");
        //3.创建集合对象
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //3.遍历并展示
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getAge());
            System.out.println(list.get(i).getGrade());
            System.out.println("==================");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        String Sid = sc.next();
        Student s = GetId(list, Sid);
        if (s == null)
            System.out.println("查无此人！");
        else{
            System.out.println("学生信息如下：");
            System.out.println(s.getId() + "\t" + s.getName() + "\t"
                    + s.getAge() + "\t" + s.getGrade());
        }

    }

    //4.定义方法完成学号搜索功能

    /**
     * 根据学生的学号，查询学生信息并返回
     *
     * @param list 存储全部学生对象的集合
     * @return 学生对象 | null
     */
    public static Student GetId(ArrayList<Student> list, String Sid) {
        for (int i = 0; i < list.size(); i++) {
            if (Sid.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }
}