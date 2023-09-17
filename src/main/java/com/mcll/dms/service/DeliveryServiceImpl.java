package com.mcll.dms.service;

import com.mcll.dms.domain.Delivery;
import com.mcll.dms.repository.DeliveryRepository;
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
