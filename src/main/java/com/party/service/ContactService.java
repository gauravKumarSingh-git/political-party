package com.party.service;

import java.util.*;

import com.party.dto.ContactDTO;
import com.party.exception.PartyException;

public interface ContactService {
	
	/**
	 * To add Contact Query to database
	 * @param contact
	 * @return String
	 * @throws PartyException
	 */
	public String addContact(ContactDTO contact) throws PartyException;
	
	/**
	 * To Update Contact Query to database
	 * @param contact
	 * @return String
	 * @throws PartyException
	 */
	public String updateContact(ContactDTO contact) throws PartyException;
	
	/**
	 * To Delete Contact Query from database
	 * @param contact
	 * @throws PartyException
	 */
	public void deleteContact(int contactId) throws PartyException;
	
	/**
	 * To get all Contacted Queries
	 * @return
	 * @throws PartyException
	 */
	public List<ContactDTO> getContacts() throws PartyException;
}

