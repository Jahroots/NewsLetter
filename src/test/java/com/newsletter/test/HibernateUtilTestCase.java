package com.newsletter.test;

import junit.framework.Assert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.newsletter.model.Users;
import com.newsletter.util.HibernateUtil;

public class HibernateUtilTestCase {

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@Test
	public void session(){
		Assert.assertNotNull(sessionFactory);
		
		Users user = new Users();
		user.setUser("Rejeb");
		
		Session session = sessionFactory.openSession();
		session.save(user);
		session.flush();
		
		final Users u = (Users) session.get(Users.class, 1);
		Assert.assertNotNull(u);
		session.close();
	}
	
}
