package Package1;

import org.testng.annotations.DataProvider;

public class TestNG_Data {
  @DataProvider(name="Dataset")
  public Object[][] f() {
	  return new Object[][] {
		  {"Data","from"}
	  };
  }
}
