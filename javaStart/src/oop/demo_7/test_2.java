package oop.demo_7;

//String常用的其他API
public class test_2 {
    public static void main(String[] args) {
        String name = "我爱你中国，你头顶的风";
        //l、 public int Length():获取字符串的长广
        System.out.println(name.length());
        //2、 public char charAt(int index):获取某个索引位置处的字符
        System.out.println(name.charAt(1));
        //3、 public char[] toCharArray ()::把字符串转换成字符数组
        System.out.println(name.toCharArray());
        //4、public String substring(int beginIndex， int endIndex) :包前不包后的
        String s1 = name.substring(6,11);
        System.out.println(s1);
        //5、public String substring(int beginIndex):从当前索引一直截取到末尾
        String s2 = name.substring(7);
        System.out.println(s2);
        //6、public string replace(CharSequence target，CharSequence replacement)
        String name2 = "狐羽落，我们都一样，狐羽落";
        String s3 = name2.replace("狐羽落","java");
        System.out.println(s3);
        //7、public boolean contains(CharSequence s)
        boolean s4 = name.contains("我");
        System.out.println(s4);
        //8. public boolean startsWith ( String prefix)
        boolean s5 = name2.startsWith("狐羽落");
        System.out.println(s5);
        //9、public string[] split(String s):按照某个内容把字符串分割成字符串数组返回。
        String name3 = "王宝强,贾乃亮,陈羽凡";
        String[] names = name3.split(",");
        for (int i = 0; i <names.length ; i++) {
            System.out.println("选择了:" + names[i]);
        }
    }
}
