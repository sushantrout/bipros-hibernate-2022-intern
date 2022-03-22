package com.bip;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bip.model.Employee;

public class HibernateTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query<Employee> query = session.createNativeQuery("SELECT * FROM employee", Employee.class);// HQL
		List<Employee> list = query.list();
		list.forEach(System.out::println);

	}
}
