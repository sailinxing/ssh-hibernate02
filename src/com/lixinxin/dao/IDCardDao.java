package com.lixinxin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.IDCard;
import com.lixinxin.utils.DBUtils;

public class IDCardDao {
	public IDCard selectById(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			IDCard card = (IDCard) session.get(IDCard.class, id);			
			tx.commit();
			return card;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
}
