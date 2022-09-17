package by.evlashkina.testtask.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import by.evlashkina.testtask.dao.ProductDao;
import by.evlashkina.testtask.entity.Product;

@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory factory;
	
	public ProductDaoImpl (SessionFactory factory) {
			this.factory = factory;
}


	@Override
	public List<Product> readAll() {
				
		List<Product> products = factory.getCurrentSession().createQuery("from Product", Product.class).list();
		        
		return products;   
		};
		 

	@Override
	public Product readEntityById(int id) {
		Product product = factory.getCurrentSession().get(Product.class, id);
		return product;
	}

	@Override
	public void delete(Product product) {
		factory.getCurrentSession().delete (product);
		
	}

	@Override
	public boolean create(Product product) {
		factory.getCurrentSession().save(product);
		return true;
	}

	@Override
	public boolean update(Product product) {
		factory.getCurrentSession().update(product);
		return false;
	}
}
	