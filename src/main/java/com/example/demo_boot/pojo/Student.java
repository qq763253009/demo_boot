package com.example.demo_boot.pojo;

/**
 * 描述： post_api学生实体类
 */
public class Student {
    Integer id;
    String name;
    // to String
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    // 构造方法， 没有构造方法 返回参数为nul
    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
