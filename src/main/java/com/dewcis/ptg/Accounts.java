package com.dewcis.ptg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.dewcis.ptg.beans.*;

public class Accounts extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(Accounts.class);

  public AccountInfoResponse getAccounts(String sessionId) {
  
  	ObjectFactory pof = new ObjectFactory();
    AccountInfoRequest request = pof.createAccountInfoRequest();
    request.setSessionId(sessionId);
    request.setAccountNumber("66");
    
    AccountInfoResponse response = (AccountInfoResponse) getWebServiceTemplate()
        .marshalSendAndReceive("https://book.ptgtravels.com/external-ws/adler/", request,
            new SoapActionCallback("https://book.ptgtravels.com/external-ws/adler/AccountInfoRequest"));

    log.info("Requesting accounts info ");

 
    return response;
  }

}
