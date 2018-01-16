package com.anu;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UserDao {
	static int i;

	public static int saveUser(User u) throws Exception { // create
															// Configuration
															// class
															// Configuration
															// object parses and
															// reads .cfg.xml
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		// before starting save(),update(), delete() operation we need to start
		// TX
		// starting tx mean con.setAutoCommit(false);
		Transaction tx = s.beginTransaction();
     // tx.begin();
		try {
      
			// stmt.addBatch("INSERT INTO school VALUES (....)");
			i = (Integer) s.save(u);

			s.flush(); // stmt.executeBatch()
			tx.commit(); // con.commit();
			System.out.println("Records inserted");
		} catch (Exception e) {
			tx.rollback(); // con.rollback();
		}
		
		return i;
	}

}
