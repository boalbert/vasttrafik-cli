package se.boalbert.vtcli.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartureBoard {
	public List<Departure> Departure;
	public String noNamespaceSchemaLocation;
	public String servertime;
	public String serverdate;

	public DepartureBoard() {
	}

	public DepartureBoard(List<Departure> departure, String noNamespaceSchemaLocation, String servertime, String serverdate) {
		this.Departure = departure;
		this.noNamespaceSchemaLocation = noNamespaceSchemaLocation;
		this.servertime = servertime;
		this.serverdate = serverdate;
	}

	@Override
	public String toString() {
		return "DepartureBoard{" +
				"Departure=" + Departure +
				", noNamespaceSchemaLocation='" + noNamespaceSchemaLocation + '\'' +
				", servertime='" + servertime + '\'' +
				", serverdate='" + serverdate + '\'' +
				'}';
	}

	public List<Departure> getDeparture() {
		return Departure;
	}

	public void setDeparture(List<Departure> departure) {
		this.Departure = departure;
	}

	public String getNoNamespaceSchemaLocation() {
		return noNamespaceSchemaLocation;
	}

	public void setNoNamespaceSchemaLocation(String noNamespaceSchemaLocation) {
		this.noNamespaceSchemaLocation = noNamespaceSchemaLocation;
	}

	public String getServertime() {
		return servertime;
	}

	public void setServertime(String servertime) {
		this.servertime = servertime;
	}

	public String getServerdate() {
		return serverdate;
	}

	public void setServerdate(String serverdate) {
		this.serverdate = serverdate;
	}
}
