
package com.consumer.busbooking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.consumer.busbooking package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BusBookingResponse_QNAME = new QName("http://endpoint.busbooking.com/", "BusBookingResponse");
    private final static QName _BusBooking_QNAME = new QName("http://endpoint.busbooking.com/", "BusBooking");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.consumer.busbooking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TicketInfo }
     * 
     */
    public TicketInfo createTicketInfo() {
        return new TicketInfo();
    }

    /**
     * Create an instance of {@link JourneyInfo }
     * 
     */
    public JourneyInfo createJourneyInfo() {
        return new JourneyInfo();
    }

    /**
     * Create an instance of {@link BusBooking }
     * 
     */
    public BusBooking createBusBooking() {
        return new BusBooking();
    }

    /**
     * Create an instance of {@link BusBookingResponse }
     * 
     */
    public BusBookingResponse createBusBookingResponse() {
        return new BusBookingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.busbooking.com/", name = "BusBookingResponse")
    public JAXBElement<BusBookingResponse> createBusBookingResponse(BusBookingResponse value) {
        return new JAXBElement<BusBookingResponse>(_BusBookingResponse_QNAME, BusBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.busbooking.com/", name = "BusBooking")
    public JAXBElement<BusBooking> createBusBooking(BusBooking value) {
        return new JAXBElement<BusBooking>(_BusBooking_QNAME, BusBooking.class, null, value);
    }

}
