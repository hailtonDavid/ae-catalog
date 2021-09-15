package org.analiseevolutiva.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.analiseevolutiva.dscatalog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Implementa o controlador REST
 */

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@GetMapping
	public ResponseEntity<List <Category>> findALL() {

		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books"));
		list.add(new Category(2L, "Eletronics"));
		
		return ResponseEntity.ok().body(list);

	}

}
