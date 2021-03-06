package ar.fi.uba.td.testFramework.nestedSuitesTest;

import ar.fi.uba.td.testFramework.*;

public class TestCase3 extends TestCase {

    public TestCase3(String nameTest) {
	super(nameTest);
    }

    @Override
    public void runTest(TestContext context) throws TestFailedException {
	MockClass mock = (MockClass) context.getElement("mockA");
	Assert.assertEquals(mock.getText(), "Using TestSuiteA context!",
		"Passing test");
    }

}
