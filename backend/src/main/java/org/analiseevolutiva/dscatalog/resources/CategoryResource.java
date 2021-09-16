package org.analiseevolutiva.dscatalog.resources;

import java.net.URI;
import java.util.List;

import org.analiseevolutiva.dscatalog.dto.CategoryDTO;
import org.analiseevolutiva.dscatalog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/*
 * Implementa o controlador REST
 */

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List <CategoryDTO>> findALL() {
		
		List<CategoryDTO> list = service.findALL();
		
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<CategoryDTO> finById(@PathVariable Long id) {
		
		CategoryDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto);

	}
	
	@PostMapping
	public ResponseEntity<CategoryDTO> insert(@RequestBody CategoryDTO dto) {
		
		dto = service.insert(dto);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		
		return ResponseEntity.created(uri).body(dto);

	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<CategoryDTO> update(@PathVariable Long id, @RequestBody CategoryDTO dto) {
		
		dto = service.update(id, dto);
		
		return ResponseEntity.ok().body(dto);

	}	
	

}
