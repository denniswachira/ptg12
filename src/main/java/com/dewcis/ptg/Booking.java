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
    
    Address pickup = new Address();
    pickup.setFormattedAddress("32 Rue Proudhon, 93210 Saint-Denis");
    pickup.setLatitude(48.906406);
    pickup.setLongitude(2.363027);
    Stop sPick = new Stop();
    sPick.setAddress(pickup);
    sPick.setOperationType(StopOperationType.PICKUP);
    
    Address drop = new Address();
    drop.setFormattedAddress("2 Cité Monthiers, 75009 Paris");
    drop.setLatitude(48.881061);
    drop.setLongitude(2.327928);
    Stop sDrop = new Stop();
    sDrop.setAddress(drop);
    sDrop.setOperationType(StopOperationType.DROP);
    
    Actor actor = new Actor();
    actor.setName("Dennis");
    actor.setTelephone("0711572013");
    actor.setType(ActorType.PASSENGER);
    
    Caller caller = new Caller();
    caller.setName("Dennis");
    
    Job job = new Job();
    job.setAccountNumber("66");
    job.setCaller(caller);
    job.setPaymentType("INVOICE");
    job.setNumberOfPassengers(1);
    job.getStops().add(sPick);
    job.getStops().add(sDrop);
    
    BookJobResponse response = (BookJobResponse) getWebServiceTemplate()
        .marshalSendAndReceive("https://book.ptgtravels.com/external-ws/adler/", request,
            new SoapActionCallback("https://book.ptgtravels.com/external-ws/adler/AddressSearchByCoordinatesRequest"));

    log.info("Requesting booking info ");

 
    return response;
  }

}
