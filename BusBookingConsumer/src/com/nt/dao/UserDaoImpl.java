package com.nt.dao;

import java.io.Reader;
import java.sql.Clob;

import org.hibernate.LobHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.UserBo;



public class UserDaoImpl implements Dao {

	@Override
	public void insertCharecterData(String charecters)throws Exception{
		//bootstra the hibernate framework 
		Configuration cfg=new Configuration().configure("com/nt/cfg/hibernate.cfg.xml");
		//crete the factory object
		SessionFactory factory=cfg.buildSessionFactory();
		//create the session 
		Session ses=factory.openSession();
		//create the entity class objet
		//convert stringmessage to clob Object
		LobHelper lob=ses.getLobHelper();
		Clob clob=lob.createClob(charecters);
		
		UserBo user=new UserBo();
		user.setCharecterData(clob);
		//open transaction 
		Transaction tx=ses.beginTransaction();
		try {
			int a=0;
			a=(Integer) ses.save(user);
			System.out.println("serializable Id::"+a);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			throw e;
			
		}
		
		finally {
			//close the session Object
			ses.close();
			//close factory Object 
			factory.close();
		}
		
		
		
		
	}


}
