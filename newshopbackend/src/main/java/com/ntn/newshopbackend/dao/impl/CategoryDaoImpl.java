package com.ntn.newshopbackend.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ntn.newshopbackend.dao.CategoryDao;
import com.ntn.newshopbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();

	static {

		// adding first category
		Category category = new Category();
		category.setId(1);
		category.setName("Telivision");
		category.setImageURL("CAT_1.png");
		category.setDiscription("This is discription for Telivision..");
		categories.add(category);

		// adding Second category

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setImageURL("CAT_2.png");
		category.setDiscription("This is discription for Mobile..");
		categories.add(category);

		// adding Third category

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setImageURL("CAT_3.png");
		category.setDiscription("This is discription for Laptop..");
		categories.add(category);

	}


	public List<Category> list() {
		
		return categories ;
	}


	
	public Category get(int id) {
		
		for(Category category :categories){
			if(category.getId()==id){
				return category;
			}
		}
		return null;
	}

}
