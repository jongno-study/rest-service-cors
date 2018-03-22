package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
	@JsonProperty("type")
	private String item;
	@JsonProperty("value")
	private Value value;
	
	public Quote() {
		
	}
	
	@Override
	public String toString() {
		return "Quote{" +
				"type='" + item + '\'' +
				", value=" + value +
				'}';
	}
}
