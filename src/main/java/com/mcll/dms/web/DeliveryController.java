package com.mcll.dms.web;

import com.mcll.dms.service.DeliveryService;
import com.mcll.dms.domain.Delivery;
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

    @GetMapping("/dealer/{dealerId}")
    public List<Delivery> getAllByDealerId(@PathVariable Long dealerId) {
        return deliveryService.getAllByDealerId(dealerId);
    }

}
