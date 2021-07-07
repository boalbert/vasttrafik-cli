package se.boalbert.vtcli.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import se.boalbert.vtcli.model.DepartureBoard.BaseDepartureBoard;
import se.boalbert.vtcli.model.DepartureBoard.Departure;
import se.boalbert.vtcli.parser.ParseInput;

import java.net.URISyntaxException;
import java.util.List;

@Component
public class Requests {
	public String BASE_URL =  "https://api.vasttrafik.se/bin/rest.exe/v2/";

	private final WebClient webClient;
	private final ParseInput parseInput;

	public Requests(WebClient webClient, ParseInput parseInput) {
		this.webClient = webClient;
		this.parseInput = parseInput;
	}

	public List<Departure> getDeparturesNow(int numberOfDepartures) throws URISyntaxException {

		String uri =
				BASE_URL +
				"departureBoard?" + // static, departureboard
				"id=9022014005650004" + // id of stop
				"&date=" + parseInput.currentDate() + // date
				"&time=" + parseInput.currentTime() + // time
				"&timeSpan=60" + // timespan to search in
				"&maxDeparturesPerLine=" + numberOfDepartures +
				"&format=json"; // response-format


		System.out.println("Calling API URI: " + uri);
		BaseDepartureBoard listBaseDepartureBoard = webClient.get()
				.uri(uri)
				.retrieve()
				.bodyToMono(BaseDepartureBoard.class)
				.block();

		return listBaseDepartureBoard.getDepartureBoard().getDeparture();
	}

	public List<Departure> searchDepartures(String time, String date, int numberOfDepartures) throws URISyntaxException {

		String uri =
				BASE_URL +
						"departureBoard?" + // static, departureboard
						"id=9022014005650004" + // id of stop
						"&date=" + date + // date
						"&time=" + parseInput.convertUserInputTime(time) + // time
						"&timeSpan=15" + // timespan to search in
						"&maxDeparturesPerLine=" + numberOfDepartures +
						"&format=json"; // response-format


		System.out.println("Calling API URI: " + uri);
		BaseDepartureBoard listBaseDepartureBoard = webClient.get()
				.uri(uri)
				.retrieve()
				.bodyToMono(BaseDepartureBoard.class)
				.block();

		return listBaseDepartureBoard.getDepartureBoard().getDeparture();
	}
}
