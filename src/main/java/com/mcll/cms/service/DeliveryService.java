package com.mcll.cms.service;

import com.mcll.cms.domain.Delivery;

import java.util.List;

public interface DeliveryService extends BaseService<Delivery> {
    List<Delivery> getAllByDealerId(long id);
}
