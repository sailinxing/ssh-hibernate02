package com.lixinxin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Course;
import com.lixinxin.utils.DBUtils;

public class CourseDao {
	public Course selectById(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Course course = (Course) session.get(Course.class, id);			
			tx.commit();
			return course;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
}
