package com.emc.shoppingcart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emc.shoppingcart.model.Transactions;

/*import java.awt.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
*/

@Repository
public class TransactionsDaoImpl  implements TransactionDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
/*	@Override
	public void save(Transactions transaction) {
		// TODO Auto-generated method stub
		
		getHibernateTemplate().save(transaction);

		
	}

	@Override
	public void update(Transactions transaction) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(transaction);
		
	}

	@Override
	public void delete(Transactions transaction) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(transaction);
		
	}*/

	@Override
	public Transactions retrieveById(Long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transactions t=(Transactions) session.get(Transactions.class,id);
		
		return t;
	}
	
	
	
	
	
	
}
		
		
	



