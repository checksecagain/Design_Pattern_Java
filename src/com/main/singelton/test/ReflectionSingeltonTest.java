package com.main.singelton.test;

import java.lang.reflect.Constructor;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.main.singelton.*;

public class ReflectionSingeltonTest {
	
  @Test
  public void EagerInitializationSingeltonTest() {
	  //EagerInitializationSingelton instanceFirst = EagerInitializationSingelton.getInstance();
	  EagerInitializationSingelton instanceSecond = null;
	  
	  try {
		  Constructor<?>[] constructors = EagerInitializationSingelton.class.getDeclaredConstructors();
		  for (Constructor<?> constructor: constructors) {
			  constructor.setAccessible(true);
			  instanceSecond = (EagerInitializationSingelton) constructor.newInstance();
			  break;
		  }
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	  //Assert.assertEquals(instanceFirst, instanceSecond);
	  Assert.assertNull(instanceSecond);
  }
}
