package com.mcll.cms.web;

import com.mcll.cms.service.DealerService;
import com.mcll.cms.domain.Dealer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dealer")
public class DealerController extends BaseController<Dealer> {

    public DealerController(DealerService dealerService) {
        super(dealerService);
    }
}
