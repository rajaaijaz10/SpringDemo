package com.costaff;

public class Setting {
    int id;
    String name;

    public Setting(int id, String age) {
        this.id = id;
        this.name = age;
    }

    @Override
    public String toString() {
        return "Setting{" +
                "id=" + id +
                ", age='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
