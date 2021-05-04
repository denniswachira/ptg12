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

public class Trip {

	private static final Logger log = LoggerFactory.getLogger(Trip.class);
	
	JobInfo jobInfo = null;
	Job job = null;

	public Job getJob(String tripDate) {
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

		XMLGregorianCalendar xmlDate = getXmlDate(tripDate);

		job = new Job();
		job.setAccountNumber("66");
		job.setCaller(caller);
		job.setJobDate(xmlDate);
		job.setPaymentType("INVOICE");
		job.setServiceCode("01");
		job.setNumberOfPassengers(1);
		job.setAsap(true); 					// The booking shall be executed immediately
		job.getActors().add(actor);
		job.getReferences().add(reference);
		job.getStops().add(pickupStop);
		job.getStops().add(destStop);

		return job;
	}
	
	public BookJobRequest getTripRequest(String sessionId, Job job) {
		String requestId = UUID.randomUUID().toString();
		System.out.println("Book Request ID : " + requestId);
		
		jobInfo = new JobInfo();
		jobInfo.setAccountName("Ben Muuo");
		jobInfo.setAccountNumber("66");
		jobInfo.setJobId(UUID.randomUUID().toString());
		jobInfo.setJobNumber("1233");
		jobInfo.setServiceCode("01");

		ObjectFactory pof = new ObjectFactory();
		BookJobRequest request = pof.createBookJobRequest();
		request.setSessionId(sessionId);
		request.setRequestId(requestId);
		request.setJob(job);
		request.setSenderJobInfo(jobInfo);
		
		return request;
	};
	
	public XMLGregorianCalendar getXmlDate(String tripDate) {
		XMLGregorianCalendar xmlDate = null;
		try {
			SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date date = parser.parse(tripDate);
        
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(date);
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return xmlDate;
	}
	
	public FinalJob changeDate(String tripDate) {
		XMLGregorianCalendar xmlDate = getXmlDate(tripDate);
		
		FinalJob finalJob = new FinalJob();
		finalJob.setAccountNumber(job.getAccountNumber());
		finalJob.setCaller(job.getCaller());
		finalJob.setJobDate(xmlDate);
		finalJob.setPaymentType(job.getPaymentType());
		finalJob.setServiceCode(job.getServiceCode());
		finalJob.setNumberOfPassengers(job.getNumberOfPassengers());
		finalJob.setAsap(true);
		finalJob.getActors().addAll(job.getActors());
		finalJob.getReferences().addAll(job.getReferences());
		//for(Stop stop : job.getStops()) finalJob.getStops().add(stop);

		return finalJob;
	}
	
	public Job getJob() {
		return job;
	}
	
	public JobInfo getJobInfo() {
		return jobInfo;
	}

}
