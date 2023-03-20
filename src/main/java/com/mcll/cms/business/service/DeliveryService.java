package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.Delivery;

import java.util.List;

public interface DeliveryService extends BaseService<Delivery> {
    List<Delivery> getAllByDealerId(long id);
}
