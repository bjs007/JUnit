package com.junittestcases.junit;
import static org.junit.Assert.*;

import org.junit.Test;

import com.junitguide.junit.FirstDayAtSchool;

public class PrepareMyBagTest {
	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag = { "Books", "Notebooks", "Pens" };

	@Test
	public void testPrepareMyBag(){
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag, school.prepareMyBag());
	}
}
