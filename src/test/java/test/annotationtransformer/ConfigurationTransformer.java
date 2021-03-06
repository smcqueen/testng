package test.annotationtransformer;

import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.IAnnotationTransformer2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ConfigurationTransformer implements IAnnotationTransformer2 {

  public void transform(ITestAnnotation annotation, Class testClass,
      Constructor testConstructor, Method testMethod)
  {
  }

  public void transform(IConfigurationAnnotation annotation, Class testClass,
      Constructor testConstructor, Method testMethod)
  {
    if (annotation.getBeforeTestMethod()) {
      annotation.setEnabled(false);
    }
  }

  public void transform(IDataProviderAnnotation annotation, Method testMethod) {
  }

  public void transform(IFactoryAnnotation annotation, Method testMethod) {
  }

}
