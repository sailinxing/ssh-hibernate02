package com.lixinxin.test;

import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.CourseDao;
import com.lixinxin.dao.IDCardDao;
import com.lixinxin.dao.StudentDao;
import com.lixinxin.dao.TeacherDao;
import com.lixinxin.model.Course;
import com.lixinxin.model.IDCard;
import com.lixinxin.model.Student;
import com.lixinxin.model.Teacher;


public class StudentDaoTest {
	StudentDao sdao;
	CourseDao cdao;
	IDCardDao idao;
	TeacherDao tdao;
	@Before
	public void init(){
		sdao=new StudentDao();
		cdao=new CourseDao();
		idao=new IDCardDao();
		tdao=new TeacherDao();
	}
	@Test
	public void testSelectById() {
		Student student=sdao.selectById(2);
		System.out.println(student);
//		System.out.println(student.getCard1().getCardName());
		System.out.println(student.getTeachers());
	}
	@Test
	public void testSelectByCourseId() {
		Course course=cdao.selectById(1);
		System.out.println(course);
		System.out.println(course.getStudentSet());
	}
	@Test
	public void testSelectByCardId() {
		IDCard card=idao.selectById(1);
		System.out.println(card.getCardName());
		System.out.println(card.getStudent1());
	}
	@Test
	public void testSelectByTeacherId() {
		Teacher teacher=tdao.selectById(4);
		System.out.println(teacher);
		System.out.println(teacher.getStudents());
		
	}


}
