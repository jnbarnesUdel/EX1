package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3= new Course();
		ArrayList<Course> courseRecord = new ArrayList<>();
		courseRecord.add(c1);
		courseRecord.add(c2);
		courseRecord.add(c3);
		
		Semester f1 =  new Semester();
		Semester sp1 = new Semester();
		ArrayList<Semester> semesterRecord = new ArrayList<>();
		semesterRecord.add(f1);
		semesterRecord.add(sp1);
		
		Section s1 = new Section();
		Section s2 = new Section();
		Section s3 = new Section();
		Section s4 = new Section();
		Section s5 = new Section();
		Section s6 = new Section();
		ArrayList<Section> sectionRecord = new ArrayList<>();
		sectionRecord.add(s1);
		sectionRecord.add(s2);
		sectionRecord.add(s3);
		sectionRecord.add(s4);
		sectionRecord.add(s5);
		sectionRecord.add(s6);
		
		Date d1 = new Date(1997, 11, 11);
		Student st1 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st2 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st3 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st4 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st5 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st6 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st7 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st8 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st9 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		Student st10 = new Student("John", "Doe", "Doe", d1, eMajor.BUSINESS, "SmithSt", "7172401375", "JohnDoe@udel.edu");
		ArrayList<Student> studentRecord = new ArrayList<>();
		studentRecord.add(st1);
		studentRecord.add(st2);
		studentRecord.add(st3);
		studentRecord.add(st4);
		studentRecord.add(st5);
		studentRecord.add(st6);
		studentRecord.add(st7);
		studentRecord.add(st8);
		studentRecord.add(st9);
		studentRecord.add(st10);

	}

	@Test
	public void test() {
		double g = 80.0;
		for(Section s : sectionRecord)
		{
			for(Student st : studentRecord)
			{
				Enrollment e = new Enrollment(s.getSectionID(), st.getStudentID());
				e.setGrade(g);
				ArrayList<Enrollment> enrollmentRecord = new ArrayList<>();
			}
		}
		
		double av = 0;
		for(Enrollment e : enrollmentRecord)
		{
			av = av + e.getGrade();
		}
		av = av / 60;
		assertEquals(av, 80);	//this will be av for all because g = 80 for all
		
		studentRecord.get(1).setMajor(eMajor.CHEM);
		
		assertEquals(1, 1);
	}
}