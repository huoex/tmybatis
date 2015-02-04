package com.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.models.Tcontactos;

public class mybatisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//XML方式
//		TcontactosDAO tdao = new TcontactosDAO();
//		tdao.selectAll();
//		
		//注解方式
		SqlSessionFactory sqlSessionFactory = MyBatisConnecctionFactory.getSqlSessionFactory();
		//这步必须做，不然会报错
		SqlSession session = sqlSessionFactory.openSession();
//		session.selectOne("abc.getById",1);
//		session.selectMap("abc.getById","1");
//		sqlSessionFactory.getConfiguration().addMapper(TcontactosMaper.class);
//		session.getMapper(Tcontactos.class);
		TcontactosMaper tcontactosMaper = session.getMapper(TcontactosMaper.class);
		tcontactosMaper.selectTcon(1);
		System.out.println();

	}

}
