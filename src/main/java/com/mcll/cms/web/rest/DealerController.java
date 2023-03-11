package com.mcll.cms.web.rest;

import com.mcll.cms.business.service.DealerService;
import com.mcll.cms.data.entity.Dealer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dealer")
public class DealerController extends BaseController<Dealer> {

    public DealerController(DealerService dealerService) {
        super(dealerService);
    }
}
