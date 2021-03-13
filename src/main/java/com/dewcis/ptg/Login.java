package com.dewcis.ptg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.dewcis.ptg.beans.ObjectFactory;
import com.dewcis.ptg.beans.LoginRequest;
import com.dewcis.ptg.beans.LoginResponse;

public class Login extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(Login.class);

  public LoginResponse getLogin(String username, String password) {
  
	ObjectFactory pof = new ObjectFactory();
    LoginRequest request = pof.createLoginRequest();
    request.setLogin(username);
    request.setPassword(password);

    log.info("Requesting login for " + username);

    LoginResponse response = (LoginResponse) getWebServiceTemplate()
        .marshalSendAndReceive("https://book.ptgtravels.com/external-ws/adler/", request,
            new SoapActionCallback("https://book.ptgtravels.com/external-ws/adler/LoginRequest"));

    return response;
  }

}
