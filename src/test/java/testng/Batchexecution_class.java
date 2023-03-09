package testng;

import org.testng.annotations.Test;

public class Batchexecution_class {
  @Test
  public void f() {
  }
}

// Batch execution using testNG.xml file. QA automation eng. 
//will integrate all the runnable classes into testNG.xml files. Run the testNG.xml 
//onetime. system will generate report for all the classes as a single file. 
//Note: you can integrate only TestNGclasses here and not java classes. 