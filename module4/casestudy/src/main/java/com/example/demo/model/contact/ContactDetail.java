package com.example.demo.model.contact;

import javax.persistence.*;

@Entity
public class ContactDetail {
    @Id
    @GeneratedValue
    private int contactDetailId;
    private int quantity;
    @OneToOne
    @JoinColumn(name = "contactId")
    Contact contact;

    public ContactDetail() {
    }

    public int getContactDetailId() {
        return contactDetailId;
    }

    public void setContactDetailId(int contactDetailId) {
        this.contactDetailId = contactDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
