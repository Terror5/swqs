package atm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AtmTests {
	
	private ATM atm;

	@Before
	public void setUp() throws Exception {
		atm = new ATM();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRefill() throws ATMException {
		atm.refill(4, 4, 2);
		assertEquals(4, atm.getCount5EUR());
		assertEquals(4, atm.getCount20EUR());
		assertEquals(2, atm.getCount50EUR());
	}
	
	@Test(expected=ATMException.class)
	public void testRefillFail() throws ATMException {
		atm.refill(-1, -1, -1);
	}
	
	@Test
	public void testAmount() throws ATMException {
		atm.refill(4, 4, 2);
		assertEquals(200, atm.totalAmount());
	}

	@Test
	public void testWithdraw() throws ATMException {
		atm.refill(4, 4, 2);
		atm.withdraw(150);
		assertEquals(50, atm.totalAmount());
	}
	
	@Test
	public void testWithdrawReturn() throws ATMException {
		atm.refill(4, 4, 2);
		Cash cashRef = new Cash(2,2,2);
		assertEquals(cashRef, atm.withdraw(150));
	}
	
	@Test(expected=ATMException.class)
	public void testWithdrawFail() throws ATMException {
		atm.refill(4, 4, 2);
		atm.withdraw(151);
	}
	
	@Test(expected=ATMException.class)
	public void testWithdrawFailToMuch() throws ATMException {
		atm.refill(4, 4, 2);
		atm.withdraw(220);
	}
	
	@Test
	public void testWithdrawZero() throws ATMException {
		atm.refill(4, 4, 2);
		atm.withdraw(0);
		assertEquals(200, atm.totalAmount());
	}
	
	@Test
	public void testCallOrder5() {
		assertEquals(0, atm.getCount5EUR());
	}
	
	@Test
	public void testCallOrder20() {
		assertEquals(0, atm.getCount20EUR());
	}
	
	@Test
	public void testCallOrder50() {
		assertEquals(0, atm.getCount50EUR());
		
	}
	
	@Test
	public void testAmountEmpty() {
		assertEquals(0, atm.totalAmount());
	}
}
