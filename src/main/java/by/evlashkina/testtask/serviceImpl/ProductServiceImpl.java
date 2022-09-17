package by.evlashkina.testtask.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import by.evlashkina.testtask.dao.ProductDao;
import by.evlashkina.testtask.entity.Product;
import by.evlashkina.testtask.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> readAll() {

		List<Product> products = productDao.readAll();

		return products;
	}

	@Override
	public Product readEntityById(int id) {
		Product product = productDao.readEntityById(id);
		return product;
	}

	@Override
	public void delete(Product product) {
		productDao.delete(product);

	}

	@Override
	public boolean create(Product product) {
		return productDao.create(product);

	}

	@Override
	public boolean update(Product product) {
		return productDao.update(product);
	}
}
