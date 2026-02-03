package org.example.contact.repository;

import org.example.contact.model.Contact;

import java.util.HashMap;
import java.util.Optional;


public class InMemoryContactRepository implements ContactRepository{
    HashMap<String, Contact> contacts=new HashMap<>();
    @Override
    public HashMap<String, Contact> saveContact(Contact c) {
        contacts.put(c.getId(),c);
        System.out.println("saved contacts");
        return contacts;
    }

    @Override
    public HashMap<String, Contact> findAll() {
       return contacts;

    }

    @Override
    public Optional<Contact> findById(String id) {
        return Optional.ofNullable(contacts.get(id));
    }

    @Override
    public void deleteContact(String id) {
        if(contacts.remove(id)!=null){
            System.out.println("contact deleted");
        }
        else{
            System.out.println("contact doesn't exist");
        }
    }
}
