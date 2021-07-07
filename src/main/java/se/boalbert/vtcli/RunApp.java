package se.boalbert.vtcli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.boalbert.vtcli.api.Requests;
import se.boalbert.vtcli.model.DepartureBoard.Departure;

import java.util.List;

@Configuration
public class RunApp {
	@Bean
	CommandLineRunner loadDatabase(Requests requests) {
		return args -> {

//			List<Departure> departuresNow = requests.getDeparturesNow(1);
//
//			System.out.println(departuresNow);

			List<Departure> searchedDepartures = requests.searchDepartures("09:55","20210707", 2);

			System.out.println(searchedDepartures);


		};
	}

}
