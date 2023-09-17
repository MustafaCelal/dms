package com.mcll.dms.web;

import com.mcll.dms.service.ProductService;
import com.mcll.dms.domain.Product;
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
