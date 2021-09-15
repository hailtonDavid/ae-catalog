package org.analiseevolutiva.dscatalog.respositories;

import org.analiseevolutiva.dscatalog.entities.Category;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepositoryImplementation<Category, Long>{

}
