package se.boalbert.vtcli.model;

public class ListDepartureBoard {

	public DepartureBoard DepartureBoard;

	public ListDepartureBoard() {
	}

	public ListDepartureBoard(DepartureBoard departureBoard) {
		this.DepartureBoard = departureBoard;
	}

	@Override
	public String toString() {
		return "ListDepartureBoard{" +
				"departureBoard=" + DepartureBoard +
				'}';
	}

	public DepartureBoard getDepartureBoard() {
		return DepartureBoard;
	}

	public void setDepartureBoard(DepartureBoard departureBoard) {
		this.DepartureBoard = departureBoard;
	}
}
