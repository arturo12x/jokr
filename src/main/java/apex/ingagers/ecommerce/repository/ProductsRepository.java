package apex.ingagers.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import apex.ingagers.ecommerce.model.Products;

public interface ProductsRepository extends CrudRepository<Products, Integer> {
    
}
