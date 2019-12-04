/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

/**
 *
 * @author gamboama_sd2022
 */
abstract class Customer {

    private String name;
    private int age;
    private String username;
    private double totalAmount;

    public Customer() {
    }

    public Customer(String name, int age, String username, double totalAmount) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.totalAmount = totalAmount;
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

    public String getPassword() {
        return username;
    }

    public void setPassword(String username) {
        this.username = username;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

}
