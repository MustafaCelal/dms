package com.mcll.dms.repository;

import com.mcll.dms.domain.Delivery;

import java.util.List;

public interface DeliveryRepository extends BaseRepository<Delivery> {

    List<Delivery> findAllByDealerIdOrderByDeliveryTimeDesc(long id);
}
