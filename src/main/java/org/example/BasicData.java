package org.example;

import java.util.Objects;

public class BasicData {
    int id;
    String name;
    String password;

    BasicData(int i, String n, String p)
    {
        id = i;
        name = n;
        password = p;
    }

    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setID(int ID)
    {
        id = ID;
    }

    public void setName(String Name)
    {
        name = Name;
    }

    public void setPassword(String Password)
    {
        password = Password;
    }

    public void print()
    {
        System.out.println("\nID: " + id );
        System.out.println("Name: " + name );
        System.out.println("Password: " + password );
    }

    @Override
    public String toString() {
        return "BasicData{" +
                "id=" + id +
                ", username='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicData that = (BasicData) o;
        // Deep comparison of nested objects if applicable
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        // Implement a consistent hash code based on the fields used in equals
        return Objects.hash(id, name, password);
    }
}

