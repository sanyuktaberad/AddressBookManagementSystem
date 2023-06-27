package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook extends Contacts{
    Contacts contact = new Contacts();
    Scanner sc = new Scanner(System.in);
    List<Contacts> contacts = new ArrayList<Contacts>();

    public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, String phoneNumber, String email) {
        super(firstName, lastName, address, city, state, zip, phoneNumber, email);
    }

    public AddressBook() {

    }


    public void addContacts(){
        System.out.println("Enter first Name =>");
        String firstname = sc.next();
        contact.setFirstName(firstName);

        System.out.println("Enter last Name =>");
        String lastName = sc.next();
        contact.setLastName(lastName);

        System.out.println("Enter address =>");
        String address = sc.next();
        contact.setAddress(address);

        System.out.println("Enter city =>");
        String city = sc.next();
        contact.setCity(city);

        System.out.println("Enter state =>");
        String state = sc.next();
        contact.setState(state);

        System.out.println("Enter zip =>");
        int zip = sc.nextInt();
        contact.setZip(zip);

        System.out.println("Enter phone number =>");
        String phoneNumber = sc.next();
        contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter email =>");
        String email = sc.next();
        contact.setEmail(email);

        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void displayContact(){
        if (contacts.isEmpty()){
            System.out.println("Address book is empty.");
        }
            for ( Contacts contact : contacts){
                System.out.println(contact.firstName);
                System.out.println(contact.lastName);
                System.out.println(contact.address);
                System.out.println(contact.city);
                System.out.println(contact.state);
                System.out.println(contact.zip);
                System.out.println(contact.phoneNumber);
                System.out.println(contact.email);
        }

    }
}
