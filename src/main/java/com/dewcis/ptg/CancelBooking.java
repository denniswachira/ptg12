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

public class CancelBooking extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(CancelBooking.class);

	public CancelJobResponse getCancelBooking(String sessionId, JobInfo senderJobInfo, JobInfo receiverJobInfo) {
	
		ObjectFactory pof = new ObjectFactory();
		CancelJobRequest request = pof.createCancelJobRequest();
		request.setSessionId(sessionId);
		request.setSenderJobInfo(senderJobInfo);
		request.setReceiverJobInfo(receiverJobInfo);
	
		CancelJobResponse response = (CancelJobResponse) getWebServiceTemplate()
			.marshalSendAndReceive("https://book.ptgtravels.com/external-ws/adler/", request,
		new SoapActionCallback("https://book.ptgtravels.com/external-ws/adler/CancelJobResponse"));

		log.info("Requesting booking info ");
	
		return null;
	}

}
