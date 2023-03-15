package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.Delivery;
import com.mcll.cms.data.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl extends BaseServiceImpl<Delivery> implements DeliveryService{
    public DeliveryServiceImpl(DeliveryRepository deliveryRepository) {
        super(deliveryRepository);
    }
}
