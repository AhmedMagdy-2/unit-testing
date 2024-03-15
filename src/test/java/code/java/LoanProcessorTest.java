package code.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanProcessorTest {
	LoanProcessor pro = new LoanProcessor();
			
	@Test
	public void testLowCredit() {
		assertEquals("Rejected: Credit score too low", pro.processLoanApp(500, true, 10));
	}
	
	@Test
	public void testUnemploy() {
		assertEquals("Rejected: Applicant must be employed", pro.processLoanApp(600, false, 10));
	}
	
	@Test
	public void testHighLoan() {
		assertEquals("Rejected: Loan amount too high", pro.processLoanApp(600, true, 50001));
	}
	
	@Test
	public void testApprovel() {
		assertEquals("Approved", pro.processLoanApp(600, true, 10));
	}
}
