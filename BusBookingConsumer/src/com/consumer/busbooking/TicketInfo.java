
package com.consumer.busbooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TicketInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bus.com/2019/namespace}JourneyInfo">
 *       &lt;sequence>
 *         &lt;element name="TimetoPickup" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketInfo", propOrder = {
    "timetoPickup"
})
public class TicketInfo
    extends JourneyInfo
{

    @XmlElement(name = "TimetoPickup", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timetoPickup;

    /**
     * Gets the value of the timetoPickup property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimetoPickup() {
        return timetoPickup;
    }

    /**
     * Sets the value of the timetoPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimetoPickup(XMLGregorianCalendar value) {
        this.timetoPickup = value;
    }

	@Override
	public String toString() {
		return "TicketInfo [timetoPickup=" + timetoPickup + "]";
	}
    

}
