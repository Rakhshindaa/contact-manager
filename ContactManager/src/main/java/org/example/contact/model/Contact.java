package org.example.contact.model;

import java.util.UUID;

public class Contact {
    private String id;
    private String name;
    private String contactNumber;
    private String email;

    public Contact(){
        this.id= UUID.randomUUID().toString();
    }
    public Contact(String name,String contact,String email){
        this.id= UUID.randomUUID().toString();
        this.name=name;
        this.contactNumber=contact;
        this.email=email;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getContactNumber(){
        return this.contactNumber;
    }
    public String getEmail(){
        return this.email;
    }
}
