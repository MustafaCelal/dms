package com.mcll.cms.repository;

import com.mcll.cms.domain.Delivery;

import java.util.List;

public interface DeliveryRepository extends BaseRepository<Delivery> {

    List<Delivery> findAllByDealerIdOrderByDeliveryTimeDesc(long id);
}
