package com.lixinxin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Student;
import com.lixinxin.utils.DBUtils;

public class StudentDao {
	public Student selectById(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Student student = (Student) session.get(Student.class, id);			
			tx.commit();
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
}
