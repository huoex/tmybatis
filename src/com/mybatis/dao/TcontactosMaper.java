package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mybatis.models.Tcontactos;

public interface TcontactosMaper {
//	@Select("SELECT * FROM contactos WHERE id = #{id}")
	List<Tcontactos> selectTcon(int id);
}
