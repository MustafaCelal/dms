package com.mcll.dms.service;

import com.mcll.dms.domain.Delivery;

import java.util.List;

public interface DeliveryService extends BaseService<Delivery> {
    List<Delivery> getAllByDealerId(long id);
}
