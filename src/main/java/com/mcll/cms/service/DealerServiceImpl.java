package com.mcll.cms.service;

import com.mcll.cms.domain.Dealer;
import com.mcll.cms.repository.DealerRepository;
import org.springframework.stereotype.Service;

@Service
public class DealerServiceImpl extends BaseServiceImpl<Dealer> implements DealerService {

    public DealerServiceImpl(DealerRepository dealerRepository) {
        super(dealerRepository);
    }
}
