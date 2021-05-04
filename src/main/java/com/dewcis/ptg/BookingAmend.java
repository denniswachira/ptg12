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

public class BookingAmend extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(BookingAmend.class);

	public BookJobResponse getBookingAmend(String sessionId, FinalJob finaljob, JobInfo senderJobInfo, JobInfo receiverJobInfo) {
	
		log.info("Canceling booking........");
		System.out.println("Book Job No1 : " + senderJobInfo.getJobNumber());
		System.out.println("Book Job No2 : " + receiverJobInfo.getJobNumber());
	
		ObjectFactory pof = new ObjectFactory();
		AmendJobRequest request = pof.createAmendJobRequest();
		request.setSessionId(sessionId);
		request.setSenderJobInfo(senderJobInfo);
		request.setReceiverJobInfo(receiverJobInfo);
		request.setJob(finaljob);
	
		BookJobResponse response = (BookJobResponse) getWebServiceTemplate()
			.marshalSendAndReceive("https://book.ptgtravels.com/external-ws/adler/", request,
		new SoapActionCallback("https://book.ptgtravels.com/external-ws/adler/BookJobResponse"));
	
		return response;
	}

}
