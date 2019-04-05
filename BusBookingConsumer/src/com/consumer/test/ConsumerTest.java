package com.consumer.test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import com.consumer.busbooking.Booking;
import com.consumer.busbooking.BusBookingImplService;
import com.consumer.busbooking.JourneyInfo;
import com.consumer.busbooking.TicketInfo;

public class ConsumerTest {

	public static void main(String[] args) throws DatatypeConfigurationException {
	//get client class it will tack to provider class
		BusBookingImplService client=new BusBookingImplService();
		Booking booking=client.getBusBookingImplPort();
		//set the data to journeyinfo 
		JourneyInfo info=new JourneyInfo();
		info.setFrom("andhrapradesh");
		info.setTo("hyd");
		info.setDateOfJourney(DatatypeFactory.newInstance().newXMLGregorianCalendar());
		TicketInfo ticketinfo=booking.busBooking(info);
		//print the ticket infooo
		System.out.println("TicketInfo:: From ->"+ticketinfo.getFrom()+"-> To:: "+ticketinfo.getTo()+" ->DateOfJourney::"+ticketinfo.getDateOfJourney()+"->pickupTime::"+ticketinfo.getTimetoPickup());
	}

}
