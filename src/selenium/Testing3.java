package selenium;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test (priority = 1 ,  groups = "smoke")
  public void createUser() {
	  System.out.println("I am in home test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(2 > 3, "Verifying Element");
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc");
	  
  }
  
  @Test (priority = 2 , dependsOnMethods = "createUser" , groups = "smoke")
  public void editUser() {
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2 > 3, "Verifying Element");
	  System.out.println("After Assertion");
	  softAssert.assertAll();
	  
  }
  
  @Test (priority = 3 , dependsOnMethods = "editUser")
  public void deleteUser() {
	  System.out.println("I am in end test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2 > 3, "Verifying Element");
	  System.out.println("After Assertion");
	  softAssert.assertEquals("abc", "abc1");
	  System.out.println("After second Assertion");
	  softAssert.assertAll();
  }
}
