package test.invokedmethodlistener;

import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.collections.Lists;

public class InvokedMethodListener implements IInvokedMethodListener {
  
  public static List<IInvokedMethod> m_methods = Lists.newArrayList();

  @Override
  public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    if (m_methods == null) m_methods = Lists.newArrayList();
    m_methods.add(method);
  }
  
  @Override
  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
  }

}
