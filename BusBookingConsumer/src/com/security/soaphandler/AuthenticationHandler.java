package com.security.soaphandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.nt.service.Service;
import com.nt.service.ServiceImpl;

public class AuthenticationHandler implements SOAPHandler<SOAPMessageContext>{

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
	//first get the soapmessage
		SOAPMessage message=context.getMessage();
		//find weather it is outbound or inbound
		Boolean outbound=(Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(outbound) {
		
			//if it is out bound we need to set the secretKey thats why get soap part and modify the header
			//get soap part to envolope
			try {
				System.out.println("out bound soap message start*******");
				File file=new File("logger.html");
				message.writeTo(new FileOutputStream(file));
				Service service=new ServiceImpl();
				service.StoreInboundMessage("logger.html");
				System.out.println("out bound soap message end*******");
				SOAPEnvelope  envelope=message.getSOAPPart().getEnvelope();
				//from envelope get header
				SOAPHeader header=envelope.getHeader();
				//from header add the elements and also add the qnameSpace to avoid the naming collison 
				//between soap xml and secretKey
				QName qname = new QName("http://service.atm.com/", "PROPERTY");
				SOAPHeaderElement soapHeaderElement = header.addHeaderElement(qname);

				soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
				// Add Secret Key to SOAP header
				soapHeaderElement.addTextNode("Venky@1234");
				message.saveChanges();
			
			} catch (SOAPException e) {
			
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		
		return true;
	}

	@Override
	public void close(MessageContext context) {
		
		
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
