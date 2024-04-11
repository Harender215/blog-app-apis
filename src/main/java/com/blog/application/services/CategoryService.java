package com.blog.application.services;

import java.util.List;

import com.blog.application.payloads.CategoryDto;

public interface CategoryService {
	//create
		CategoryDto createCategory(CategoryDto categoryDto);
		
		//update
		CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
		
		//delete
		void deleteCategory(Integer categoryId);
		
		//get
		CategoryDto getCategory(Integer categoryId);
		
		//getAll
		List<CategoryDto> getCategories();

}
