package se.boalbert.vtcli.model.DepartureBoard;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Departure {

	public String name;
	public String sname;
	public String journeyNumber;
	public String type;
	public String stopid;
	public String stop;
	public String time;
	public String date;
	public String journeyid;
	public String direction;
	public String track;
	public String fgColor;
	public String bgColor;
	public String stroke;
	public JourneyDetailRef JourneyDetailRef;

	public Departure() {
	}

	public Departure(String name, String sname, String journeyNumber, String type, String stopid, String stop, String time, String date, String journeyid, String direction, String track, String fgColor, String bgColor, String stroke, JourneyDetailRef journeyDetailRef) {
		this.name = name;
		this.sname = sname;
		this.journeyNumber = journeyNumber;
		this.type = type;
		this.stopid = stopid;
		this.stop = stop;
		this.time = time;
		this.date = date;
		this.journeyid = journeyid;
		this.direction = direction;
		this.track = track;
		this.fgColor = fgColor;
		this.bgColor = bgColor;
		this.stroke = stroke;
	}

//	@Override
//	public String toString() {
//		return "Departure{" +
//				"name='" + name + '\'' +
//				", sname='" + sname + '\'' +
//				", journeyNumber='" + journeyNumber + '\'' +
//				", type='" + type + '\'' +
//				", stopid='" + stopid + '\'' +
//				", stop='" + stop + '\'' +
//				", time='" + time + '\'' +
//				", date='" + date + '\'' +
//				", journeyid='" + journeyid + '\'' +
//				", direction='" + direction +
//				'}';
//	}
	@Override
	public String toString() {
		return
					stop + " " + direction + " - " + // 5 Kålltorp - 12:34, 2017-07-07
					time + " " + date + " (" + track + ") \n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getJourneyNumber() {
		return journeyNumber;
	}

	public void setJourneyNumber(String journeyNumber) {
		this.journeyNumber = journeyNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStopid() {
		return stopid;
	}

	public void setStopid(String stopid) {
		this.stopid = stopid;
	}

	public String getStop() {
		return stop;
	}

	public void setStop(String stop) {
		this.stop = stop;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getJourneyid() {
		return journeyid;
	}

	public void setJourneyid(String journeyid) {
		this.journeyid = journeyid;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getFgColor() {
		return fgColor;
	}

	public void setFgColor(String fgColor) {
		this.fgColor = fgColor;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getStroke() {
		return stroke;
	}

	public void setStroke(String stroke) {
		this.stroke = stroke;
	}

}
