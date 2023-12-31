package projectUserItem;

import projectUser.Admins;
import projectUser.Customers;
import projectUser.Sellers;

public class Users {
    private Customers customer;
    private Sellers seller;
    private Admins admin;
    private int age;
    private String email;
    private String address;
    private String name;
    private String password;
    public String phone;

    public Users(String name, String address, int age, String password, String email, String phone){
        this.name = name;
        this.address = address;
        this.age = age;
        this.password = password;
        this.email = email;
        this.phone = phone;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
