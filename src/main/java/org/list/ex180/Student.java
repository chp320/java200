package org.list.ex180;

import org.list.ex157.Grade;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {   // 직렬화 위해서 java.io.Serializable 인터페이스를 구현 !!

//    private static final long serialVersionUID = 12234214234L;
    private static final long serialVersionUID = 12234214237L;
    private String name;
    private int id;
    private String address;
    private Grade grade;

    public Student(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return name + " " + id + " " + address;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return this;
        }
    }

    // 객체 비교를 하기 위해서는 equals와 hashCode가 필요하다.
    public boolean equals(Object obj) {
        boolean isE = false;
        Student temp = (Student) obj;
        if (temp.getName().equals(name) && temp.getId() == id && temp.getAddress().equals(address)) {
            isE = true;
        }
        return isE;
    }

    public int hashCode() {
        int temp = 0;
        temp = name.hashCode() + address.hashCode() + id + 37;
        return temp;
    }

}
