package org.example.contactmanager.service;

import org.example.contactmanager.domain.Contact;

import java.util.List;

/**
 * Created by SERGE on 03.09.2014.
 */
public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);

}
