package com.example.springbootreact.controller;

import com.example.springbootreact.model.Contact;
import com.example.springbootreact.repository.ContactRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {
    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @GetMapping("/contacts")
    Collection<Contact> getAllContacts(){
        return (Collection<Contact>) this.contactRepository.findAll();
    }

    @PostMapping("/contacts")
    ResponseEntity<Contact> createContact( @RequestBody Contact contact){
        Contact res= this.contactRepository.save(contact);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
}
