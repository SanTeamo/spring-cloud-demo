package com.santeamo.model;

import java.io.Serializable;

/**
 * Title
 * ClassName com.santeamo.model.User.java
 * Description
 *
 * @author santeamo
 * @date  2019-10-23 下午 2:03
 * @version V1.0
 */
public class User implements Serializable {

    private String id;
    private Integer age;
    private String name;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
