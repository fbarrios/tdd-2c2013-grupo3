package ar.fi.uba.td.testFramework.nestedSuitesTest;

import ar.fi.uba.td.testFramework.TestCase;
import ar.fi.uba.td.testFramework.TestContext;
import ar.fi.uba.td.testFramework.TestFailedException;

public class TestCase7 extends TestCase {

	public TestCase7(String nameTest) {
		super(nameTest);
	}

	@Override
	public void runTest(TestContext context) throws TestFailedException {
		assertTrue(true, "Passing test");
	}

}
