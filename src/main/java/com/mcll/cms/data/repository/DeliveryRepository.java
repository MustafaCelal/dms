package com.mcll.cms.data.repository;

import com.mcll.cms.data.entity.Delivery;

import java.util.List;

public interface DeliveryRepository extends BaseRepository<Delivery> {

    List<Delivery> findAllByDealerIdOrderByDeliveryTimeDesc(long id);
}
