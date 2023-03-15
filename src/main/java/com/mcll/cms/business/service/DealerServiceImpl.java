package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.Dealer;
import com.mcll.cms.data.repository.DealerRepository;
import org.springframework.stereotype.Service;

@Service
public class DealerServiceImpl extends BaseServiceImpl<Dealer> implements DealerService {

    public DealerServiceImpl(DealerRepository dealerRepository) {
        super(dealerRepository);
    }
}
