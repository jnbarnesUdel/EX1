package com.cisc181.core;

import java.util.UUID;

public class Enrollment 
{
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){
	}
	
	public Enrollment(UUID SectionID, UUID StudentID)
	{
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.setEnrollmentID(EnrollmentID);
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}
	
	//Making things void makes them a procedure
	public void setGrade(double grade) {
		Grade = grade;
	}
	
}
