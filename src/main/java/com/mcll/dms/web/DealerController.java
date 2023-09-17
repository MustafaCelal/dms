package com.mcll.dms.web;

import com.mcll.dms.service.DealerService;
import com.mcll.dms.domain.Dealer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dealer")
public class DealerController extends BaseController<Dealer> {

    public DealerController(DealerService dealerService) {
        super(dealerService);
    }
}
