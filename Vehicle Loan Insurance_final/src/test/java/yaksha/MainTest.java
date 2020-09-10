package test.java.yaksha;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.java.yaksha.TestUtils;
import main.java.yaksha.Vehicle;

class MainTest {

	@Test
	void testIssueLoan() throws IOException {
		Vehicle v=new Vehicle( "12345", "Honda", "4wheeler", 300000) ; 
		//assertEquals(150000.0, v.issueLoan());
		TestUtils.yakshaAssert(TestUtils.currentTest(),v.issueLoan()==150000.0==true?"true":"false",TestUtils.businessTestFile);

	}
	@Test
	void testTakeInsurance() throws IOException {
		Vehicle v=new Vehicle( "12345", "Honda", "4wheeler", 300000) ;
		//assertEquals(4000.0, v.takeInsurance());
		TestUtils.yakshaAssert(TestUtils.currentTest(),v.takeInsurance()==4000.0==true?"true":"false",TestUtils.businessTestFile);

	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}

	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}

}
