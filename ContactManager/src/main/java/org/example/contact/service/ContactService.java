package org.example.contact.service;
import org.example.contact.model.*;
import org.example.contact.repository.InMemoryContactRepository;

import java.util.ArrayList;
import java.util.Optional;
public class ContactService {
    public static void main(String args[]){
        Optional<Contact> contacts=Optional.empty();
        InMemoryContactRepository inrepos=new InMemoryContactRepository();
        inrepos.saveContact(new Contact("Saif","987654301","abc@gmail.com"));



    }

}
