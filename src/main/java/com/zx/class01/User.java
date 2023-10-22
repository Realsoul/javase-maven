package com.zx.class01;
//对象内存图：https://www.bilibili.com/video/BV17F411T7Ao?p=87&spm_id_from=pageDriver&vd_source=0c76bb886f0646e15627273b09e0f577
public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //方法1.快捷键添加构造方法和get+set：   Fn+Alt+insert
   //方法2：插件ptg  -->右键-Ptg to JavaBean
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
