package org.analiseevolutiva.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.analiseevolutiva.dscatalog.dto.CategoryDTO;
import org.analiseevolutiva.dscatalog.entities.Category;
import org.analiseevolutiva.dscatalog.respositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true)
	public List<CategoryDTO> findALL() {

		List<Category> list = repository.findAll();
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());

	}
}
