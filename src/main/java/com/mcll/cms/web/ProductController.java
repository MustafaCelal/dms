package com.mcll.cms.web;

import com.mcll.cms.service.ProductService;
import com.mcll.cms.domain.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController extends BaseController<Product> {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        super(productService);
        this.productService = productService;
    }

}
