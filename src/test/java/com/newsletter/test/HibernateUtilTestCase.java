package com.newsletter.test;

import com.newsletter.model.Users;
import com.newsletter.util.HibernateUtil;
import junit.framework.Assert;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import java.util.List;

public class HibernateUtilTestCase {

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static final String FAKE_USER  = "fakeUser";
    private static final String FAKE_VILLE = "fakeVille";

    private static Session session;
    private static final String SQL_ALL_USER = "from Users u";

    @Test
    public void session(){
        Assert.assertNotNull(sessionFactory);
        session = sessionFactory.openSession();
        Assert.assertNotNull(session);
    }
    @Test
	public void crudUsers(){
		Users user = new Users();
		user.setUser(FAKE_USER);

        // Save User
		session.save(user);
		session.flush();

        // Retrieve User
		final Users u1 = (Users) session.load(Users.class, 1);
		Assert.assertNotNull(u1);
        Assert.assertEquals(FAKE_USER, u1.getUser());

        // Update User
        user.setVille(FAKE_VILLE);
        session.update(user);

        final Users u2 = (Users) session.load(Users.class, 1);
        Assert.assertNotNull(u2);
        Assert.assertEquals(FAKE_VILLE, u2.getVille());

        // Delete User
        final List<Users> usersList = session.createQuery(SQL_ALL_USER).list();
        Assert.assertFalse(usersList.isEmpty());

        session.delete(user);
        Assert.assertTrue(session.createQuery(SQL_ALL_USER).list().isEmpty());

		session.close();
	}
	
}
