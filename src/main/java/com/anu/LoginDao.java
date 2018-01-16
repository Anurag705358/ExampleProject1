package com.anu;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.criteria.CriteriaQuery;

import java.util.Date;
import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class LoginDao {
boolean status=false;
	@SuppressWarnings("deprecation")
	public boolean validate(User u){
   
		SessionFactory sf = HibernateUtility.getSessionFactory();
			Session s = sf.openSession();
			
			Transaction tx = s.beginTransaction();
	
	         Criteria cr = s.createCriteria(User.class);
	         // Add restriction.
	        //cr.add(Restrictions.eq("email",u.getEmail()));
	         List e = cr.list();
	         ListIterator itr=e.listIterator(); 
	      
	         while(itr.hasNext()){  
	         User y= (User) itr.next();
	         String  mail=y.getEmail();
	         String  pwd=y.getPassword();

	       System.out.println(mail+" "+pwd);
	         System.out.println(u.getEmail());
	         if((mail.equals(u.getEmail()))&&(pwd.equals(u.getPassword())))
	         { status=true;
	        	 System.out.println("Succes");  
	         }
	         }

		

		
			tx.commit();
			s.close();
		

		
		
		return status;
		
	}
}
