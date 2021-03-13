package com.dewcis.ptg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.dewcis.ptg.beans.*;

public class Booking extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(Booking.class);

  public BookJobResponse getBooking(String sessionId) {
  
	ObjectFactory pof = new ObjectFactory();
    BookJobRequest request = pof.createBookJobRequest();
    request.setSessionId(sessionId);
    
    BookJobResponse response = (BookJobResponse) getWebServiceTemplate()
        .marshalSendAndReceive("https://book.ptgtravels.com/external-ws/adler/", request,
            new SoapActionCallback("https://book.ptgtravels.com/external-ws/adler/AddressSearchByCoordinatesRequest"));

    log.info("Requesting booking info ");

 
    return response;
  }

}
