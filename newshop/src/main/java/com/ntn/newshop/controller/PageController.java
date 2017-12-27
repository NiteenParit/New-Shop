package com.ntn.newshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ntn.newshopbackend.dao.CategoryDao;
import com.ntn.newshopbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categoryDao;
	
	
	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Home");
		
		//Passing the list of categories..
		
		model.addObject("categories",categoryDao.list());
		model.addObject("userClickHome",true);
		return model;
	}
	
	@RequestMapping(value = { "/about" })
	public ModelAndView about() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "About us");
		model.addObject("userClickAbout",true);
		return model;

	}
	
	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Contact us");
		model.addObject("userClickContact",true);
		return model;

	}
	
	/*Method to load all the product based on category...*/
	
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showAllProducts() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "All Products");
		
		//Passing the list of categories..
		
		model.addObject("categories",categoryDao.list());
		model.addObject("userClickAllProducts",true);
		return model;
	}
	
	@RequestMapping(value = {"/show/category/{id}/products"})
	public ModelAndView showCtegoryProducts(@PathVariable("id")int id) {

		ModelAndView model = new ModelAndView("page");
		
		
		//Category to fetch a single category..
		Category category=null;
		
		category=categoryDao.get(id);
		model.addObject("title",category.getName());		
		
		//Passing the list of categories..
		model.addObject("categories",categoryDao.list());
		model.addObject("category",category);
		
		model.addObject("userClickCategoryProducts",true);
		return model;
	}
	
	
	
	
}
