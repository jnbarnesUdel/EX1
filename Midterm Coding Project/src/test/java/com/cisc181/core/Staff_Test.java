package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eNewTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		Date d1 = new Date(1997, 11, 21);
		Date d2 = new Date(2011, 10, 14);
		Staff s1 = new Staff("Jon", "doe", "Doe", d1, "Jo strt", "7172401375", "JonDoe@udel.edu",
				"7 to 9", 12, 40000.00, d2, eNewTitle.Dr);
		Staff s2 = new Staff("Jon", "doe", "Doe", d1, "Jo strt", "7172401375", "JonDoe@udel.edu",
				"7 to 9", 12, 50000.00, d2, eNewTitle.Dr);
		Staff s3 = new Staff("Jon", "doe", "Doe", d1, "Jo strt", "7172401375", "JonDoe@udel.edu",
				"7 to 9", 12, 460000.00, d2, eNewTitle.Dr);
		Staff s4 = new Staff("Jon", "doe", "Doe", d1, "Jo strt", "7172401375", "JonDoe@udel.edu",
				"7 to 9", 12, 140000.00, d2, eNewTitle.Dr);
		Staff s5 = new Staff("Jon", "doe", "Doe", d1, "Jo strt", "7172401375", "JonDoe@udel.edu",
				"7 to 9", 12, 240000.00, d2, eNewTitle.Dr);
		
		ArrayList<Staff> alist = new ArrayList<>();
		alist.add(s1);
		alist.add(s2);
		alist.add(s3);
		alist.add(s4);
		alist.add(s5);
		
		int total = 0;
		for(Staff s : alist)
		{
			total = total + (int)s.getSalary();
		}
		int av = total / 5;
		assertEquals(av, 186000);
		assertEquals(1,1);
		
	}	
	
	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException {
		Date d1 = new Date(1997, 11, 21);
		Date d2 = new Date(2011, 10, 14);
		// wrong phone number
		Staff s1 = new Staff("Jon", "doe", "Doe", d1, "Jo strt", "7", "JonDoe@udel.edu",
				"7 to 9", 12, 40000.00, d2, eNewTitle.Dr);
		//over 100 years ago DOB
		Date d3 = new Date(97, 11, 21);
		Staff s2 = new Staff("Jon", "doe", "Doe", d3, "Jo strt", "7172401375", "JonDoe@udel.edu",
				"7 to 9", 12, 40000.00, d2, eNewTitle.Dr);
	// Run some code that will throw PersonException.class
	// This test will fail if that exception ISN'T thrown...!
	}

}
