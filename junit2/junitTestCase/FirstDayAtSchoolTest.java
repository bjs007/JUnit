package com.junittestcases.junit;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.junitguide.junit.FirstDayAtSchool;

public class FirstDayAtSchoolTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();
	
	String[] bag1 = {"Books","Notebooks","Pens"};
	String[] bag2 = {"Books","Notebooks","Pens","Pencils"};
	
	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1,school.prepareMyBag());
	}
	
	@Test	
	public void testAddPencils(){
		assertArrayEquals(bag2,school.addPencils());
	}
	
	@Ignore
	@Test
	public void testAddPencilsIgnore(){
		assertArrayEquals(bag2,school.addPencils());
	}

}
