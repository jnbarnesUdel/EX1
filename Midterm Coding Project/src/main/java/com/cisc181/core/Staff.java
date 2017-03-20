package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eNewTitle;

public class Staff extends Employee {

	 private eNewTitle Title;

	   public Staff(eNewTitle title){
	        this.Title = title;
	    }

	    public void setTitle(eNewTitle title){
	        this.Title = title;
	    }
	    public eNewTitle getTitle(){
	        return this.Title;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eNewTitle Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}