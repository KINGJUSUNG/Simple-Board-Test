package org.example.board.vo;

public class CustomerVo {
    private int ID;
    private String name;
    private int age;

    public CustomerVo() {}
    public CustomerVo(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}