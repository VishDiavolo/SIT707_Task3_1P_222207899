package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

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
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("January 1 Should Decrement To December 31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("January 1 Should Increment To January 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
		System.out.println("test January Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("january 31 Should Decrement To January 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("january 31 Should Increment To February 1 > " + date);
		date.increment();
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {
		DateUtil date = new DateUtil(1, 2, 2024);
		System.out.println("February 1 Should Decrement To January 31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testMinFebruary1ShouldIncrementToFebruary2() {
		DateUtil date = new DateUtil(1, 2, 2024);
		System.out.println("February 1 Should Increment To February 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testNominalFebruary() {
		int rand_day_1_to_29 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_29, 2, 2024);
		System.out.println("test February Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxFebruary29ShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("February 29 Should Decrement To February 28 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("February 29 Should Increment To March 1 > " + date);
		date.increment();

		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinMarch1ShouldDecrementToFebruary29() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("March 1 Should Decrement To February 29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMinMarch1ShouldIncrementToMarch2() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("March 1 Should Increment To March 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalMarch() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
		System.out.println("test March Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {

		DateUtil date = new DateUtil(31, 3, 2024);
		System.out.println("March 31 Should Decrement To March 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
		DateUtil date = new DateUtil(31, 3, 2024);
		System.out.println("March 31 Should Increment To April 1 > " + date);
		date.increment();

		Assert.assertEquals(4, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinApril1ShouldDecrementToMarch31() {
		DateUtil date = new DateUtil(1, 4, 2024);
		System.out.println("April 1 Should Decrement To March 31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testMinApril1ShouldIncrementToApril2() {
		DateUtil date = new DateUtil(1, 4, 2024);
		System.out.println("April 1 Should In crement To April 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(4, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalApril() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 4, 2024);
		System.out.println("test April Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxApril30ShouldDecrementToApril29() {
		DateUtil date = new DateUtil(30, 4, 2024);
		System.out.println("April 30 Should Decrement To April 29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
		DateUtil date = new DateUtil(30, 4, 2024);
		System.out.println("April 30 Should Increment To May 1 > " + date);
		date.increment();

		Assert.assertEquals(5, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinMayl1ShouldDecrementToApril30() {
		DateUtil date = new DateUtil(1, 5, 2024);
		System.out.println("May 1 Should Decrement To April 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testMinMay1ShouldIncrementToMay2() {
		DateUtil date = new DateUtil(1, 5, 2024);
		System.out.println("May 1 Should Increment To May 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(5, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalMay() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
		System.out.println("test May Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxMay31ShouldDecrementToMay30() {
		DateUtil date = new DateUtil(31, 5, 2024);
		System.out.println("May 31 Should Decrement To May 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
		DateUtil date = new DateUtil(31, 5, 2024);
		System.out.println("May 31 Should Increment To June 1 > " + date);
		date.increment();

		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinJune1ShouldDecrementToMay31() {
		DateUtil date = new DateUtil(1, 6, 2024);
		System.out.println("June 1 Should Decrement To May 31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testMinJune1ShouldIncrementToJune2() {
		DateUtil date = new DateUtil(1, 6, 2024);
		System.out.println("June 1 Should Increment To June 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalJune() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 6, 2024);
        System.out.println("test June Nominal > " + date);
        date.increment();
        System.out.println(date);
	}

	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
		DateUtil date = new DateUtil(30, 6, 2024);
		System.out.println("january 31 Should Decrement To January 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
		DateUtil date = new DateUtil(30, 6, 2024);
		System.out.println("June 30 Should Increment To July 1 > " + date);
		date.increment();

		Assert.assertEquals(7, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinJuly1ShouldDecrementToJune30() {
		DateUtil date = new DateUtil(1, 7, 2024);
		System.out.println("July 1 Should Decrement To June 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testMinJuly1ShouldIncrementToJuly2() {
		DateUtil date = new DateUtil(1, 7, 2024);
		System.out.println("July 1 Should Increment To July 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(7, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalJuly() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
		System.out.println("test July Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxJuly31ShouldDecrementToJuly30() {
		DateUtil date = new DateUtil(31, 7, 2024);
		System.out.println("July 31 Should Decrement To July 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testMaxJuly31ShouldIncrementToAuguest1() {
		DateUtil date = new DateUtil(31, 7, 2024);
		System.out.println("July 31 Should Increment To Auguest 1 > " + date);
		date.increment();

		Assert.assertEquals(8, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinAuguest1ShouldDecrementToJuly31() {
		DateUtil date = new DateUtil(1, 8, 2024);
		System.out.println("Auguest 1 Should Decrement To July 31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testMinAuguest1ShouldIncrementToAuguest2() {
		DateUtil date = new DateUtil(1, 8, 2024);
		System.out.println("Auguest 1 Should Increment To Auguest 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(8, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalAuguest() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
		System.out.println("test Auguest Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxAuguest31ShouldDecrementToAuguest30() {
		DateUtil date = new DateUtil(31, 8, 2024);
		System.out.println("Auguest 31 Should Decrement To Auguest 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testMaxAuguest31ShouldIncrementToSeptember1() {
		DateUtil date = new DateUtil(31, 8, 2024);
		System.out.println("Auguest 31 Should Increment To September 1 > " + date);
		date.increment();

		Assert.assertEquals(9, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinSeptember1ShouldDecrementToAuguest31() {
		DateUtil date = new DateUtil(1, 9, 2024);
		System.out.println("September 1 Should Decrement To Auguest 31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testMinSeptember1ShouldIncrementToSeptember2() {
		DateUtil date = new DateUtil(1, 9, 2024);
		System.out.println("September 1 Should Increment To September 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(9, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalSeptember() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 9, 2024);
		System.out.println("test September Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxSeptember30ShouldDecrementToSeptember29() {
		DateUtil date = new DateUtil(30, 9, 2024);
		System.out.println("September 30 Should Decrement To September 29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
		DateUtil date = new DateUtil(30, 9, 2024);
		System.out.println("September 31 Should Increment To October1 1 > " + date);
		date.increment();

		Assert.assertEquals(10, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinOctober1ShouldDecrementToSeptember30() {
		DateUtil date = new DateUtil(1, 10, 2024);
		System.out.println("October 1 Should Decrement To September 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testMinOctober1ShouldIncrementToOctoberr2() {
		DateUtil date = new DateUtil(1, 10, 2024);
		System.out.println("October 1 Should Increment To October 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(10, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalOctoberr() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
		System.out.println("test October Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxOctober31ShouldDecrementToOctober30() {
		DateUtil date = new DateUtil(31, 10, 2024);
		System.out.println("October 31 Should Decrement To October 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("October 31 Should Increment To November 1 > " + date);
		date.increment();

		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinNovember1ShouldDecrementToOctober31() {
		DateUtil date = new DateUtil(1, 11, 2024);
		System.out.println("November 1 Should Decrement To October 31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testMinNovember1ShouldIncrementToNovember2() {
		DateUtil date = new DateUtil(1, 11, 2024);
		System.out.println("November 1 Should Increment To November 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(11, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalNovember() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 11, 2024);
		System.out.println("test November Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxNovember30ShouldDecrementToNovember29() {
		DateUtil date = new DateUtil(30, 11, 2024);
		System.out.println("November 30 Should Decrement To November 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
		DateUtil date = new DateUtil(30, 11, 2024);
		System.out.println("November 30 Should Increment To December 1 > " + date);
		date.increment();

		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMinDecember1ShouldDecrementToNovember30() {
		DateUtil date = new DateUtil(1, 12, 2024);
		System.out.println("December 1 Should Decrement To November 31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testMinDecember1ShouldIncrementToDecember2() {
		DateUtil date = new DateUtil(1, 12, 2024);
		System.out.println("December 1 Should Increment To December 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNominalDecember() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
		System.out.println("test January Nominal > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
		DateUtil date = new DateUtil(31, 12, 2024);
		System.out.println("December 31 Should Decrement To December 30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1() {
		DateUtil date = new DateUtil(31, 12, 2024);
		System.out.println("December 31 Should Increment To January 1 > " + date);
		date.increment();

		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}
}
