package com.shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    // Variable Declaration Starting...........
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private String phone;
    private String address;
    private String gender;
    private String password;
    private String image;
    private boolean isActive;
    // Variable Declaration Ending...........

    // --------------------------------------------------------------------------------------------

    // Generate Getter And Setters For All Variables Staring..............

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Generate Getter And Setters For All Variables Ending..............

    // --------------------------------------------------------------------------------------------

    // Generate Default And perametrize Constructor Staring................
    public Customer() {
    }

    public Customer(int id, String name, String email, String phone, String address, String gender, String password,
            String image, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.image = image;
        this.isActive = isActive;
    }
    // Generate Default And perametrize Constructor Staring................

    // --------------------------------------------------------------------------------------------

    // Override toString() For This Class Staring...............
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
                + address + ", gender=" + gender + ", password=" + password + ", image=" + image + ", isActive="
                + isActive + "]";
    }
    // Override toString() For This Class Ending...............

}
