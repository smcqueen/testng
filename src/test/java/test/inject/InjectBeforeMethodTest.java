package test.inject;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InjectBeforeMethodTest {
  private int m_beforeIndex = 0;
  private int m_afterIndex = 0;
  private static final Object[][] DATA = { 
      new Object[] { "a" },
      new Object[] { "b" },
  };
  
  @BeforeMethod
  public void before(Object[] parameters) {
    Assert.assertEquals(DATA[m_beforeIndex], parameters);
    m_beforeIndex++;
  }
  
  @DataProvider
  public Object[][] dp() {
    return DATA;
  }

  @AfterMethod
  public void after(Object[] parameters) {
    Assert.assertEquals(DATA[m_afterIndex], parameters);
    m_afterIndex++;    
  }

  @Test(dataProvider = "dp")
  public void f(String a) {
  }

}
