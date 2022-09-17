package by.evlashkina.testtask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.evlashkina.testtask.entity.Product;
import by.evlashkina.testtask.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping()
	public String printHello(Model model) {
		List <Product> products = productService.readAll();
		model.addAttribute("products", products);
		return "hello";
	}

		@GetMapping("/{id}")
	public String add(Model model, @PathVariable int id) {
		Product product = productService.readEntityById(id);
		model.addAttribute("product", product);
		return "pages/products";
	}

	

	@DeleteMapping("/{id}")
	    public String delete(Model model,  @PathVariable int id) {
		Product product = productService.readEntityById(id);
	        productService.delete(product);
	        return "pages/products";
	    }

}
