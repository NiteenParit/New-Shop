package com.ntn.newshopbackend.dao;

import java.util.List;

import com.ntn.newshopbackend.dto.Category;

public interface CategoryDao {
	
	 List<Category> list();

	Category get(int id);


	

}
