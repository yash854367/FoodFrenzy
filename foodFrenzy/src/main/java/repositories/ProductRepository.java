package repositories;

import org.springframework.data.repository.CrudRepository;

import entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	public Product findByPname(String name);

}
