package com.mcll.cms.web.rest;

import com.mcll.cms.business.service.DeliveryService;
import com.mcll.cms.data.entity.Delivery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController extends BaseController<Delivery> {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        super(deliveryService);
        this.deliveryService = deliveryService;
    }

    @GetMapping("/dealer/{id}")
    public List<Delivery> getAllByDealerId(@PathVariable Long id) {
        return deliveryService.getAllByDealerId(id);
    }

}
