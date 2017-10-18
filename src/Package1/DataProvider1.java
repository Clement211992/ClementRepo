package Package1;

import org.testng.annotations.*;
import org.testng.annotations.Test;
@Test(suiteName="G")
public class DataProvider1 {
/*  @Test(dataProvider = "DataSetA")
  public void TestA(String Row, String Col) {
	  System.out.println(Row +" "+ Col);
  }

  @Test(dataProvider = "DataSetC")
  public void TestC(String Row, String Col) {
	  System.out.println(Row +" "+ Col);
  }

*/  @Test(dataProvider = "Dataset", dataProviderClass = TestNG_Data.class,expectedExceptions=RuntimeException.class)
  public void TestB(String row, String col) {
	  //System.out.println("Second:"+row+" "+col);
	  throw new RuntimeException();
  }
  
  
  @DataProvider(name="DataSetA")
  public Object[][] DataSetA(){
	  return new Object[][] 
	{
		  {"A11","A12"},
		  {"B11","B12"},
		  {"C11","C12"}
    };
  }
  
    @DataProvider(name="DataSetC")
    public Object[][] DataSetC(){
  	  return new Object[][] 
  	{
  		  {"c11","c12"},
  		  {"c21","c22"},
  		  {"C31","C32"}
      };
	  
  }
}
