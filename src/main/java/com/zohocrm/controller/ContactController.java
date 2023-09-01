package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contact;
import com.zohocrm.service.ContactService;

@Controller
public class ContactController {
    @Autowired
	private ContactService contactService;
    
    @RequestMapping("/listcontacts")
    public String listContacts(Model model) {
    	List<Contact> contacts = contactService.getContacts();
    	model.addAttribute("contacts", contacts);
    	return "list_contacts";
    }
}
