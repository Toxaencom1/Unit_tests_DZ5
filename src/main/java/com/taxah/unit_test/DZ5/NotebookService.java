package com.taxah.unit_test.DZ5;

import java.util.List;

public class NotebookService {
    ContactRepository contactRepository;

    public List<Contact> getAllContacts(){
        return contactRepository.getAll();
    }

    public Contact findContact(int id) {
        return contactRepository.find(id);
    }

    public List<Contact> findByName(String name) {
        return contactRepository.findByName(name);
    }

    public void addContact(Contact contact) {
        contactRepository.add(contact);
    }

    public void deleteContact(int id) {
        contactRepository.delete(id);
    }

    public void updateContact(Contact contact) {
        contactRepository.update(contact);
    }
}
