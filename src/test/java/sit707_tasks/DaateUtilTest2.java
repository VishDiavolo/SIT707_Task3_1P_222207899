package sit707_tasks;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class DaateUtilTest2 {

	@Test
	public void Expectednextdayof_1_6_1994() {
		DateUtil date = new DateUtil(1, 6, 1994);
		System.out.println("June 1 Should Increment To June 2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void Expectednextdayof_2_6_1994() {
		DateUtil date = new DateUtil(2, 6, 1994);
		System.out.println("June 2 Should Increment To June 3 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(3, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_6_1994() {
		DateUtil date = new DateUtil(15, 6, 1994);
		System.out.println("June 15 Should Increment To June 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void Expectednextdayof_30_6_1994() {
		DateUtil date = new DateUtil(30, 6, 1994);
		System.out.println("June 30 Should Increment To July 1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void Expectednextdayof_31_6_1994() {
		DateUtil date = new DateUtil(31, 6, 1994);
		System.out.println("June 31 Should Increment To July 1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_1_1994() {
		DateUtil date = new DateUtil(15, 1, 2024);
		System.out.println("January 15 Should Increment To January 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_2_1994() {
		DateUtil date = new DateUtil(15, 2, 2024);
		System.out.println("February 15 Should Increment To February 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_11_1994() {
		DateUtil date = new DateUtil(15, 11, 2024);
		System.out.println("November 15 Should Increment To November 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_12_1994() {
		DateUtil date = new DateUtil(15, 12, 2024);
		System.out.println("December 15 Should Increment To December 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_6_1700() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("Juny 15 Should Increment To Juny 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_6_1701() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("Juny 15 Should Increment To Juny 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_6_2023() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("Juny 15 Should Increment To Juny 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void Expectednextdayof_15_6_2024() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("Juny 15 Should Increment To Juny 16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void Expectednextdayof_27_2_1788() {
		DateUtil date = new DateUtil(27, 2, 1788);
		System.out.println("February 27 Should Increment To February 28 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void Expectednextdayof_29_2_1731() {
		DateUtil date = new DateUtil(29, 2, 1731);
		System.out.println("January 1 Should Increment To December 31 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void Expectednextdayof_28_2_1764() {
		DateUtil date = new DateUtil(28, 2, 1764);
		System.out.println("February 28 Should Increment To February 29 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}
}
