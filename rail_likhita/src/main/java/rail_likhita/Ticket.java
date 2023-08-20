package rail_likhita;

import java.util.ArrayList;
import java.util.Date;

public class Ticket {
	String pnr;
	String from;
	String to;
	Date date;
	ArrayList<Passenger> plist;
	public Ticket(String pnr, String from, String to, Date date, ArrayList<Passenger> plist) {
		super();
		this.pnr = pnr;
		this.from = from;
		this.to = to;
		this.date = date;
		this.plist = plist;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ArrayList<Passenger> getPlist() {
		return plist;
	}
	public void setPlist(ArrayList<Passenger> plist) {
		this.plist = plist;
	}
	
	
	

}
