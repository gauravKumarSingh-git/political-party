package com.party.service;

import java.util.List;

import com.party.dto.EventDTO;
import com.party.exception.PartyException;

public interface EventService {
	/**
	 * To add event to database
	 * @param event
	 * @return String
	 * @throws PartyException
	 */
	public String addEvent(EventDTO event) throws PartyException;
	
	/**
	 * To update event present in database
	 * @param event
	 * @return String
	 * @throws PartyException
	 */
	public String updateEvent(EventDTO event) throws PartyException;
	
	/**
	 * To delete event present in database
	 * @param eventId
	 * @throws PartyException
	 */
	public void deleteEvent(int eventId) throws PartyException;
	
	/**
	 * To get event based on id
	 * @param eventId
	 * @return EventDTO
	 * @throws PartyException
	 */
	public EventDTO getEventById(int eventId) throws PartyException;
	
	/**
	 * To get all events
	 * @return
	 * @throws PartyException
	 */
	public List<EventDTO> getEvents() throws PartyException;
}
