package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ContactRepository;
import com.entity.Contact;
@RequestMapping("/contact")
@RestController
@CrossOrigin
public class ConatactController {
	@Autowired
    private ContactRepository contactRepository;

    @PostMapping("/addContact")
    public String saveContact(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return "Contact Saved Successfully!";
    }
}
