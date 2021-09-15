package org.analiseevolutiva.dscatalog.services;

import java.util.List;

import org.analiseevolutiva.dscatalog.entities.Category;
import org.analiseevolutiva.dscatalog.respositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	public List<Category> findALL() {
		
		return repository.findAll();

	}
}
