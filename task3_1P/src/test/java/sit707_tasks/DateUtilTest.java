package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Hashini Gunathilaka
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = null;
		Assert.assertNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Hashini";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024); // January 1, 2024
	    System.out.println("January1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024); // January 1, 2024
	    System.out.println("January1ShouldDecrementToDecember31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testId1A() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    date.decrement();
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testId2A() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    date.decrement();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testId3A() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testId4A() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    date.decrement();
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test(expected = RuntimeException.class)
	public void testId5A() {
	    new DateUtil(31, 6, 1994);
	}

	@Test
	public void testId6A() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testId7A() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testId8A() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testId9A() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testId10A() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void testId11A() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void testId12A() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testId13A() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	//leap year
	@Test
	public void testFebruaryLeapYear29ShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2020);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	}

	@Test
	public void testFebruaryLeapYear28ShouldIncrementToFebruary29() {
	    DateUtil date = new DateUtil(28, 2, 2020);
	    date.increment();
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	}

	@Test
	public void testFebruaryLeapYear28ShouldDecrementToFebruary27() {
	    DateUtil date = new DateUtil(28, 2, 2020);
	    date.decrement();
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	}

	@Test(expected = RuntimeException.class)
	public void testFebruaryLeapYear29InvalidYearShouldThrowException() {
	    new DateUtil(29, 2, 2021); 
	}
}