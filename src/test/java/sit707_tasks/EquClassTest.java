package sit707_tasks;
import org.junit.Test;
import java.util.Random;


import org.junit.Assert;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "222207899";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Vishuddha Samarasekara";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testIncrementFrom28thTo29th() {
		DateUtil date = new DateUtil(28, 1, 2023);
		date.increment();
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testIncrementFrom29thTo30thIn31DayMonth() {
		DateUtil date = new DateUtil(29, 1, 2023);
		date.increment();
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testIncrementFrom29thTo1stInNonLeapFebruary() {
		DateUtil date = new DateUtil(28, 2, 2023);
		date.increment();
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testIncrementFrom29thTo1stInLeapFebruary() {
		DateUtil date = new DateUtil(29, 2, 2024);
		date.increment();
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testIncrementFrom30thTo31stIn31DayMonth() {
		DateUtil date = new DateUtil(30, 1, 2023);
		date.increment();
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testIncrementFrom30thTo1stIn30DayMonth() {
		DateUtil date = new DateUtil(30, 4, 2023);
		date.increment();
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(5, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testIncrementFrom31stTo1stNextMonth() {
		DateUtil date = new DateUtil(31, 1, 2023);
		date.increment();
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testDecrementFrom1stToLastDayPreviousMonth() {
		DateUtil date = new DateUtil(1, 2, 2023);
		date.decrement();
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testDecrementFrom29thTo28thInLeapFebruary() {
		DateUtil date = new DateUtil(29, 2, 2024);
		date.decrement();
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testDecrementFrom31stTo30th() {
		DateUtil date = new DateUtil(31, 3, 2023);
		date.decrement();
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testYearEndToYearStart() {
		DateUtil date = new DateUtil(31, 12, 2023);
		date.increment();
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testYearStartToYearEnd() {
		DateUtil date = new DateUtil(1, 1, 2024);
		date.decrement();
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
}
