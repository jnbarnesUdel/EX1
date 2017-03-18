package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester 
{
	private UUID SemesterID;
	private Date Date;
	private Date EndDate;
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
}
