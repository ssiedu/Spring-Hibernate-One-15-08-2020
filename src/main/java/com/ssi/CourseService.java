package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	private SessionFactory sessionFactory;
	
	public CourseService() {
		Configuration config=new Configuration().configure().addAnnotatedClass(Course.class);
		sessionFactory=config.buildSessionFactory();
	}
	
	public Course saveCourse(Course course) {
		//write code for saving course details
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(course);
		tr.commit();
		session.close();
		return course;
	}
	
	
	
	
	
	
}
