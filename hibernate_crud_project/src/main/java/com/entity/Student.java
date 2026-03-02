package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    private int id;
    private String name;
    private long phone;
    private boolean deleted = false; // Soft delete

    public Student() {}

    public Student(int id, String name, long phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    // Getters & Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }

    public boolean isDeleted() { return deleted; }
    public void setDeleted(boolean deleted) { this.deleted = deleted; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', phone=" + phone + "}";
    }
}

