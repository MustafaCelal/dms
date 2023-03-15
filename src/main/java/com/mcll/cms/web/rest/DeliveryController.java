package com.mcll.cms.web.rest;

import com.mcll.cms.business.service.DeliveryService;
import com.mcll.cms.data.entity.Delivery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController extends BaseController<Delivery>{
    public DeliveryController(DeliveryService deliveryService) {
        super(deliveryService);
    }
}
