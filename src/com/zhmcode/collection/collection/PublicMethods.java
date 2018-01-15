package com.zhmcode.collection.collection;


import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by zhm on 2018/1/15.
 */

public class PublicMethods {
  private Collection collection = new ArrayList();
	@Before
	public void init(){
		collection.add("hello1");
		collection.add("hello2");
		collection.add("hello3");
		collection.add("hello4");
	}

	@Test
	public void testMethods(){

	}


}
