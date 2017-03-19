package com.cisc181.core;

import java.util.Date;
import java.util.regex.Pattern;

public class PersonException extends Exception 
{
	Person Person;
	String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	public PersonException(String message)
	{
		super(message);
	}
	if(Person.PrintAge()<100)
	{
	}
	else
	{
		throw new PersonException("Age over 100");
	}
	
	Pattern pattern = Pattern.compile(regex);
	if(pattern.matcher(Person.getPhone()) == false)
	{
		throw new PersonException("phone num wrong");
	}
}