package com.emc.shoppingcart;



import javax.validation.constraints.AssertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.emc.shoppingcart.dao.TransactionDao;
import com.emc.shoppingcart.model.Transactions;

/*
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml","file:src/main/webapp/WEB-INF/spring/root-context.xml"})
*/
  

 public class TransactionTest {
	
	 @Autowired
	 TransactionDao t1;

	
	@Test
	public void testEntitySave() {
		 Transactions t=new Transactions(2,"30-05-2015" , "placed", 1200);
		 
			System.out.println("Testing....");
			t1.save(t);
			
		}

}
