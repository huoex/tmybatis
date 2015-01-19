package com.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class mybatisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//XML方式
		TcontactosDAO tdao = new TcontactosDAO();
		tdao.selectAll();
		
		//注解方式
		SqlSessionFactory sqlSessionFactory = MyBatisConnecctionFactory.getSqlSessionFactory();
		//这步必须做，不然会报错
		sqlSessionFactory.getConfiguration().addMapper(TcontactosMaper.class);
		SqlSession session = sqlSessionFactory.openSession();
		TcontactosMaper tcontactosMaper = session.getMapper(TcontactosMaper.class);
		tcontactosMaper.selectTcon(1);

	}

}
