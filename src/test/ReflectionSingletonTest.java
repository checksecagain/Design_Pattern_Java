package test;

import java.lang.reflect.Constructor;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.singleton.*;

public class ReflectionSingletonTest {
	
  @Test
  public void EagerInitializationSingeltonTest() {
	  //EagerInitializationSingelton instanceFirst = EagerInitializationSingelton.getInstance();
	  EagerInitializationSingleton instanceSecond = null;
	  
	  try {
		  Constructor<?>[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
		  for (Constructor<?> constructor: constructors) {
			  constructor.setAccessible(true);
			  instanceSecond = (EagerInitializationSingleton) constructor.newInstance();
			  break;
		  }
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	  //Assert.assertEquals(instanceFirst, instanceSecond);
	  Assert.assertNull(instanceSecond);
  }
}
