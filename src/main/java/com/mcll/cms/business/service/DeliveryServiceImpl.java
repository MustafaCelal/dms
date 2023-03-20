package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.Delivery;
import com.mcll.cms.data.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl extends BaseServiceImpl<Delivery> implements DeliveryService {

    private final DeliveryRepository deliveryRepository;


    public DeliveryServiceImpl(DeliveryRepository deliveryRepository) {
        super(deliveryRepository);
        this.deliveryRepository = deliveryRepository;
    }


    @Override
    public List<Delivery> getAllByDealerId(long id) {
        return deliveryRepository.findAllByDealerIdOrderByDeliveryTimeDesc(id);
    }
}
