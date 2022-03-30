package Module2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class VCTextAnalyzerGUITest {

	@Test
	public void TestAnalyzerGUI() {

	}		
		public static void main(String[] args) {
		      Result TestAnalyzerResults = JUnitCore.runClasses(VCTextAnalyzerGUI.class);
				
		      for (Failure failure : TestAnalyzerResults.getFailures()) {
		         System.out.println(failure.toString());
		      }
				
		      System.out.println(TestAnalyzerResults.wasSuccessful());
	
	}
}
