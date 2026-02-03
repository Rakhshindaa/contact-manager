package org.example.contact.repository;

import org.example.contact.model.Contact;

import java.util.HashMap;
import java.util.Optional;

public interface ContactRepository {

    //save
    HashMap<String, Contact> saveContact(Contact c);
    //find
    Optional<Contact> findById(String id);
    //findAll
    HashMap<String, Contact> findAll();
    //delete
   void deleteContact(String id);


}
