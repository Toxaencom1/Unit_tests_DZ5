package com.taxah.unit_test.DZ5;

public class UI {
    NoteBookController noteBookController;
    public void showMessageToUser(String message) {
        System.out.println(message);
    }

    public String getNameFromUser() {
        return "Name From User";
    }

    public String getNumberFromUser() {
        return "Number From User";
    }

    public void MenuChoice(int id) {
        switch (id){
            case 1: noteBookController.addContact();
            break;
            // итд
            default: noteBookController.showAllContacts();
        }
    }
}
