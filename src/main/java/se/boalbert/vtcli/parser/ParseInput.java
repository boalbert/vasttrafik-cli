package se.boalbert.vtcli.parser;

import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ParseInput {

	public String currentTime() throws URISyntaxException {
		String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

		return new URI(URLEncoder.encode(currentTime, StandardCharsets.UTF_8)).toString();
	}

	public String currentDate() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	}

	public String convertUserInputTime(String userInputTime) throws URISyntaxException {
		if (validateUserInputTime(userInputTime)) {
			String formattedUserInputTime = LocalTime.parse(userInputTime).format(DateTimeFormatter.ofPattern("HH:mm"));

			return new URI(URLEncoder.encode(formattedUserInputTime, StandardCharsets.UTF_8)).toString();
		} else {
			System.out.println("Error matching time...");
			return "00:00";
		}
	}

	public boolean validateUserInputTime(String userTime) {
		String regex = "/^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$/"; // HH:MM 24-hour format, optional leading 0

		Pattern p = Pattern.compile(regex);

		if (userTime == null) {
			return false;
		}

		System.out.println("Matching time: " + userTime);

		Matcher m = p.matcher(userTime);

		return m.matches();
	}

}
