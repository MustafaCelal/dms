package com.mcll.cms.web.rest;

import com.mcll.cms.business.service.ProductService;
import com.mcll.cms.data.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") long id) {
        return productService.findById(id);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.create(product);
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable("id") long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable("id") long id) {
        productService.delete(id);

        return "Product Deleted";
    }

    @GetMapping("/admin/allproducts")
    public List<Product> allProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/admin/deletedproducts")
    public List<Product> deletedProducts() {
        return productService.getAllDeletedProducts();
    }
}
