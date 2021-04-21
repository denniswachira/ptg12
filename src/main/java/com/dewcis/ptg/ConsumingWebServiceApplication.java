package com.dewcis.ptg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dewcis.ptg.beans.*;

@SpringBootApplication
public class ConsumingWebServiceApplication {

	@Autowired private Login lg;

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ptgConfiguration.class);
        Login client = context.getBean(Login.class);
 		
		String username = "ptg_integration";
		String password = "9DyOJATR";

		LoginResponse response = client.getLogin(username, password);
		System.out.println("Session Id" + response.getSessionId());
		System.out.println("Response Code" + response.getResponseCode());
		
	}

	@Bean
	CommandLineRunner lookup(Login login, Logout logout, Accounts accounts, Booking booking, CancelBooking cancelBooking) {
		return args -> {
			String username = "ptg_integration";
			String password = "9DyOJATR";

			LoginResponse response = login.getLogin(username, password);
			String sessionId = response.getSessionId();

			System.out.println("<><><>sessionId : " + sessionId);
			System.out.println("<><><>responseCode : " + response.getResponseCode());
			
			Trip trip = new Trip();
			Job job = trip.getJob("2021-05-12 10:10");
			BookJobRequest tripRequest = trip.getTripRequest(sessionId, job);
			
			BookJobResponse book = booking.getBooking(tripRequest);
			System.out.println("BookJobResponse : " + book.getResponseCode());
			System.out.println("BookJobResponse : " + book.getMessage());
			System.out.println("Book Job ID : " + book.getSenderJobInfo().getJobId());
			System.out.println("Book Price : " + book.getPrice().getCurrencyCode());
			System.out.println("Book Price Gross : " + book.getPrice().getGross());
			System.out.println("Book Price Net : " + book.getPrice().getNet());
			System.out.println("Book Price Total : " + book.getPrice().getTaxTotal());
			
			CancelJobResponse cBooking = cancelBooking.getCancelBooking(sessionId, tripRequest.getSenderJobInfo(), book.getSenderJobInfo());
			System.out.println("LogoutResponse : " + cBooking.getResponseCode());
			
			LogoutResponse logoutResp = logout.getLogout(sessionId);
			System.out.println("LogoutResponse : " + logoutResp.getResponseCode());
		};
	}

}
