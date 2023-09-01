package com.zohocrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void saveContact(Contact contact) {
	   contactRepo.save(contact);

	}

	@Override
	public List<Contact> getContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

}
