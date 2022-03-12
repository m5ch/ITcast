package oop.Task;

public class test_1 {
    public static void main(String[] args) {
        //创建三个电影对象，封装电影信息
        Movie m1 = new Movie("《长津湖》",9.7 ,"吴京");
        Movie m2 = new Movie("《我和我的父辈》",9.6 ,"吴京");
        Movie m3 = new Movie("《扑水少年》",9.5,"王川");

        //定义一个电影类型的数组，存储电影对象
        Movie[] movies = new Movie[3];
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影名" + m.getName());
            System.out.println("电影得分" + m.getScore());
            System.out.println("电影导演" + m.getDirector());
            System.out.println("-=-=-=-=-=-=-=-=-=");
        }
    }
}
