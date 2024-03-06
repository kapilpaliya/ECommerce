package com.shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
    // Variable Declaration Starting...........
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Please choose a username!")
    @Size(min = 4, max = 15, message = "length 4 to 15 character!")
    private String name;
    
    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid email!")
     @NotBlank(message = "Please choose a email!")
    private String email;

    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "Invalid phone!")
     @Size(min = 10, max = 12, message = "Phone must have at least 10 character!")
     @NotBlank(message = "Please choose a phone number!")
    private String phone;
     @NotBlank(message = "Please choose a address!")
    private String address;
     
     @Size(min=8, max=15, message = "Password must have at least 8 character!")
     @NotBlank(message = "Please choose a password!")
    private String password;

    private String image;

    private boolean isActive = true;
     @NotBlank(message = "Please provide a valid city!")
    private String city;

     @NotBlank(message = "Please select a valid state!")
    private String state;
     
     @Size(min=6, max=6, message = "Invalide pin code!")
     @NotBlank(message = "Please provide a valid pincode!")
    private String pincode;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    // Generate Getter And Setters For All Variables Ending..............

    // --------------------------------------------------------------------------------------------

    // Generate Default And perametrize Constructor Staring................
    public Customer() {
    }

    public Customer(int id, String name, String email, String phone, String address, String password, String image,
            boolean isActive, String city, String state, String pincode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.image = image;
        this.isActive = isActive;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    // Generate Default And perametrize Constructor Staring................

    // --------------------------------------------------------------------------------------------

    // Override toString() For This Class Staring...............
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
                + address + ", password=" + password + ", image=" + image + ", isActive=" + isActive + ", city=" + city
                + ", state=" + state + ", pincode=" + pincode + "]";
    }
    // Override toString() For This Class Ending...............

}
