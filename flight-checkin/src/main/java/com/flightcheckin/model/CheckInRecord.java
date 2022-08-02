package com.flightcheckin.model;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Checkin")
public class CheckInRecord {

	@Transient
	public static final String SEQUENCE_NAME = "checkin_id";

	@Id
	long checkinId;

	String firstName;
	String lastName;
	String seatNumber;
	Date checkInTime;
	String flightNumber;
	String flightDate;

	public CheckInRecord() {
	}

	public CheckInRecord(long checkinId, String firstName, String lastName, String seatNumber, Date checkInTime,
			String flightNumber, String flightDate) {

		this.checkinId = checkinId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.seatNumber = seatNumber;
		this.checkInTime = checkInTime;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
	}

	public long getCheckinId() {
		return checkinId;
	}

	public void setCheckinId(long checkinId) {
		this.checkinId = checkinId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Date getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	@Override
	public String toString() {
		return "CheckInRecord [Checkin-Id = " + checkinId + ", First Name = " + firstName + ", Last Name = " + lastName
				+ ", Seat Number = " + seatNumber + ", Check In Time = " + checkInTime + ", Flight Number = "
				+ flightNumber + ", Flight Date = " + flightDate + "]";
	}

}
