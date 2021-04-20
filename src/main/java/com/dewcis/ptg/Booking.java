package com.dewcis.ptg;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.dewcis.ptg.beans.*;

public class Booking extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(Booking.class);

	public BookJobResponse getBooking(String sessionId) {

		String requestId = UUID.randomUUID().toString();
		System.out.println("Book Request ID : " + requestId);

		ObjectFactory pof = new ObjectFactory();
		BookJobRequest request = pof.createBookJobRequest();
		request.setSessionId(sessionId);
		request.setRequestId(requestId);

		Stop pickupStop = new Stop();
		Address pickAddr = new Address();
		pickAddr.setLatitude(-1.2668519608692084 );
		pickAddr.setLongitude(36.81177449014947);
		pickAddr.setFormattedAddress( "Galitos Kobil Ojijo Road");
		pickupStop.setAddress(pickAddr);
		pickupStop.setOperationType(StopOperationType.PICKUP);
		pickupStop.setNotes("THIS IS A TEST CALL FROM Ben - DO NOT ACT UPON");

		Stop destStop = new Stop();
		Address destAddr = new Address();
		destAddr.setLatitude(-1.2583996908819741);
		destAddr.setLongitude(36.80564832509152);
		destAddr.setFormattedAddress("The Oval");
		destStop.setAddress(destAddr);
		destStop.setOperationType(StopOperationType.DROP);
		destStop.setNotes("THIS IS A TEST CALL FROM Ben - DO NOT ACT UPON");

		Actor actor = new Actor();
		actor.setIndividualId("3dccf0e9-84ef-a5c8-99315-c22cccf457bf");
		actor.setName("Dennis Gichangi");
		actor.setTelephone("+254711572013");
		actor.setEmail("dennis@dennis.me.ke");
		actor.setType(ActorType.PASSENGER);

		Reference reference = new Reference();
		reference.setEntityName("Route");
		reference.setValue("Westy");

		Caller caller = new Caller();
		caller.setIndividualId("3dccf0e9-84ef-a5c8-9915-c22cccf457bf");
		caller.setName("Test Account");

		XMLGregorianCalendar xmlDate = null;
		try {
			String input = "2021-05-12 10:10";
			SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date date = parser.parse(input);
        
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(date);
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch(Exception e) {
			e.printStackTrace();
		}

		Job job = new Job();
		job.setAccountNumber("66");
		job.setCaller(caller);
		job.setJobDate(xmlDate);
		job.setPaymentType("INVOICE");
		job.setServiceCode("01");
		job.setNumberOfPassengers(1);
		job.setAsap( true ); 					// The booking shall be executed immediately
		job.getActors().add(actor);
		job.getReferences().add(reference);
		job.getStops().add(pickupStop);
		job.getStops().add(destStop);

		request.setJob(job);

		BookJobResponse response = (BookJobResponse) getWebServiceTemplate()
			.marshalSendAndReceive("https://book.ptgtravels.com/external-ws/adler/", request,
		new SoapActionCallback("https://book.ptgtravels.com/external-ws/adler/AddressSearchByCoordinatesRequest"));

		log.info("Requesting booking info ");


		return response;
	}

}
