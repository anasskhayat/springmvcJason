package es.dicotraining.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import es.dicotraining.weather.domains.Country;
import es.dicotraining.weather.places.Places;
import es.dicotraining.weather.weather.Query;
import es.dicotraining.weather.weather.Url;
import es.dicotraining.weather.weather.Weather;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	private static final String WEATHER_SUFFIX = "%22&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";
	private static final String WEATHER_PREFIX = "https://query.yahooapis.com/v1/public/yql?q=SELECT%20*%20FROM%20weather.forecast%20WHERE%20woeid%3D%22";
	private static final String PLACES_SUFFIX = WEATHER_SUFFIX;
	private static final String PLACES_PREFIX = "https://query.yahooapis.com/v1/public/yql?q=SELECT%20*%20FROM%20geo.places%20WHERE%20text%3D%22";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		model.addAttribute(new Country());
		
		return "home";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String home(@ModelAttribute Country country, Model model) throws RestClientException, URISyntaxException{
		RestTemplate restTemplate = new RestTemplate();
		Places places = restTemplate.getForObject(new URI(PLACES_PREFIX+country.getCountry()+PLACES_SUFFIX), Places.class);
		
		String woeid = places.getQuery().getResults().getPlace().get(0).getWoeid();
		System.out.println("El woeid de "+country.getCountry()+" es: "+woeid);
		
		Weather weather = restTemplate.getForObject(new URI(WEATHER_PREFIX+woeid+WEATHER_SUFFIX), Weather.class);
		Query query = weather.getQuery();
		
		model.addAttribute("forecast", query.getResults().getChannel().getItem().getDescription());
		
		return "result";
		
	}
}








