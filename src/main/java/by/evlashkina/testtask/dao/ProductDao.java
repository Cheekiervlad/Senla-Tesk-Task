package by.evlashkina.testtask.dao;

import java.util.List;


import by.evlashkina.testtask.entity.Product;

public interface ProductDao {

	public List<Product> readAll();

	public Product readEntityById(int id);

	public 	void delete(Product product);

	public boolean create(Product product);

	public boolean update(Product product);

	
}
