package com.heowc.server.quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/quote")
public class QuoteController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public Quote getQuote() {
		return restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	}
}
