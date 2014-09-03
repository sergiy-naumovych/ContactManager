package org.example.contactmanager.dao;

import org.example.contactmanager.domain.Contact;

import java.util.List;

/**
 * Created by SERGE on 03.09.2014.
 */
public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
