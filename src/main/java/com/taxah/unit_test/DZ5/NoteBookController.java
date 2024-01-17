package com.taxah.unit_test.DZ5;

public class NoteBookController {
    NotebookService notebookService;
    UI userInterface;
    public void showAllContacts(){
        userInterface.showMessageToUser(notebookService.getAllContacts().toString());
    }

    public void showFoundByName(String name){
        userInterface.showMessageToUser(notebookService.findByName(name).toString());
    }

    public void addContact(){
        String name = userInterface.getNameFromUser();
        String number = userInterface.getNumberFromUser();
        Contact contact = new Contact(name,number);
        notebookService.addContact(contact);
    }

    public void deleteContact(int id){
        Contact tmp = notebookService.findContact(id);
        notebookService.deleteContact(tmp.getId());
        userInterface.showMessageToUser("Contact Deleted");

    }
    public void updateContact(int id){
        Contact tmp = notebookService.findContact(id);
        tmp.setName(userInterface.getNameFromUser());
        tmp.setContact(userInterface.getNumberFromUser());
        notebookService.updateContact(tmp);
        userInterface.showMessageToUser("Contact Updated");
    }
}
