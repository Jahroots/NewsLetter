package com.newsletter.test;

import com.newsletter.model.Users;
import com.newsletter.util.HibernateUtil;
import junit.framework.Assert;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

public class HibernateUtilTestCase {

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static final String FAKE_USER = "fakeUser";

    @Test
	public void session(){
		Assert.assertNotNull(sessionFactory);
		
		Users user = new Users();
		user.setUser(FAKE_USER);
		
		Session session = sessionFactory.openSession();
		session.save(user);
		session.flush();
		
		final Users u = (Users) session.get(Users.class, 1);
		Assert.assertNotNull(u);
        Assert.assertEquals(FAKE_USER, u.getUser());
		session.close();
	}
	
}
