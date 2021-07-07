package se.boalbert.vtcli.model.DepartureBoard;

public class JourneyDetailRef {
	public String ref;

	public JourneyDetailRef(String ref) {
		this.ref = ref;
	}

	public JourneyDetailRef() {
	}

	public String getRef() {
		return ref;
	}

	@Override
	public String toString() {
		return "JourneyDetailRef{" +
				"ref='" + ref + '\'' +
				'}';
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
}
