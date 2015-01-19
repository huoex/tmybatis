package com.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import com.mybatis.models.Tcontactos;

public interface TcontactosMaper {
	@Select("SELECT * FROM contactos WHERE id = #{id}")
	Tcontactos selectTcon(int id);
}
