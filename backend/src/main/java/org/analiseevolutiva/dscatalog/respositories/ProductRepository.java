package org.analiseevolutiva.dscatalog.respositories;

import org.analiseevolutiva.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepositoryImplementation<Product, Long>{

}
