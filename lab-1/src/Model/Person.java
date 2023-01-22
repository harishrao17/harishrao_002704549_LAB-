/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Person {

    String firstName;
    Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person() {
        this.firstName = "";
        this.address = new Address();
    }

    public static void main(String args[]) {
        Person obj = new Person();
        
        obj.setFirstName("Harish");
        
        Address addr = obj.getAddress();
        addr.setStreetName("Horadan Way");
        

    }

}
