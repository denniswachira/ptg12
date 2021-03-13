package com.dewcis.ptg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.dewcis.ptg.beans.ObjectFactory;
import com.dewcis.ptg.beans.LogoutRequest;
import com.dewcis.ptg.beans.LogoutResponse;

public class Logout extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(Logout.class);

  public LogoutResponse getLogout(String sessionId) {
  
	ObjectFactory pof = new ObjectFactory();
    LogoutRequest request = pof.createLogoutRequest();
    request.setSessionId(sessionId);

    log.info("Requesting logout for " + sessionId);

    LogoutResponse response = (LogoutResponse) getWebServiceTemplate()
        .marshalSendAndReceive("https://book.ptgtravels.com/external-ws/adler/", request,
            new SoapActionCallback("https://book.ptgtravels.com/external-ws/adler/LoginRequest"));

    return response;
  }

}
