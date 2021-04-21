package com.dewcis.ptg;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ptgConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.dewcis.ptg.beans");
		return marshaller;
	}

	@Bean
	public Login login(Jaxb2Marshaller marshaller) {
		Login client = new Login();
		client.setDefaultUri("https://book.ptgtravels.com/external-ws/adler/");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Bean
	public Logout logout(Jaxb2Marshaller marshaller) {
		Logout client = new Logout();
		client.setDefaultUri("https://book.ptgtravels.com/external-ws/adler/");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Bean
	public Accounts accounts(Jaxb2Marshaller marshaller) {
		Accounts client = new Accounts();
		client.setDefaultUri("https://book.ptgtravels.com/external-ws/adler/");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Bean
	public Booking booking(Jaxb2Marshaller marshaller) {
		Booking client = new Booking();
		client.setDefaultUri("https://book.ptgtravels.com/external-ws/adler/");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Bean
	public CancelBooking cancelBooking(Jaxb2Marshaller marshaller) {
		CancelBooking client = new CancelBooking();
		client.setDefaultUri("https://book.ptgtravels.com/external-ws/adler/");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
