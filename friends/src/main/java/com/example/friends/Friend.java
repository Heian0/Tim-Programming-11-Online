package com.example.friends;

public class Friend
{
    public String name;
    private long phone;
    private int age;

    Friend(String name, long phone, int age)
    {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    // get/set
    public String GetName()
    {
        return this.name;
    }

    public long GetPhone()
    {
        return this.phone;
    }

    public int GetAge()
    {
        return this.age;
    }

    public void SetPhone(int phone)
    {
        this.phone = phone;
    }

    public void setEmail(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
