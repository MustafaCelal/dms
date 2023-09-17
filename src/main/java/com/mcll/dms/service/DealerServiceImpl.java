package com.mcll.dms.service;

import com.mcll.dms.domain.Dealer;
import com.mcll.dms.repository.DealerRepository;
import org.springframework.stereotype.Service;

@Service
public class DealerServiceImpl extends BaseServiceImpl<Dealer> implements DealerService {

    public DealerServiceImpl(DealerRepository dealerRepository) {
        super(dealerRepository);
    }
}
