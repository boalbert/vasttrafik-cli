package se.boalbert.vtcli.parser;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class ParseInputTest {


	@Test
	void currentTime() throws URISyntaxException, UnsupportedEncodingException {

		ParseInput parseInput = new ParseInput();

		parseInput.currentTime();
	}
}