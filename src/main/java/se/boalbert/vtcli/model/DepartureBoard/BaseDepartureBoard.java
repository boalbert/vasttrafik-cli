package se.boalbert.vtcli.model.DepartureBoard;

public class BaseDepartureBoard {

	public DepartureBoard DepartureBoard;

	public BaseDepartureBoard() {
	}

	public BaseDepartureBoard(DepartureBoard departureBoard) {
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
