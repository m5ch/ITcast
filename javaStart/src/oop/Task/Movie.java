package oop.Task;

/*
    目标:完成电影信息的展示案例，理解面向对象编程的代码
    ”《长津湖》”，9.7 ，“吴京"
    ”《我和我的父辈》"，9.6 ，“吴京”
    ”《扑水少年》"，9.5，“王川"
 */

public class Movie {
    //1、成员变量
    private String name;
    private double score;
    private String director;

    //无参数构造器

    public Movie() {

    }


    //有参数构造器

    public Movie(String name, double score, String director) {
        this.name = name;
        this.score = score;
        this.director = director;
    }


    //getter+setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
