package com.xxkj.tsk.controlller;

import com.xxkj.tsk.entity.Shop;
import com.xxkj.tsk.service.ShopService;
import com.xxkj.tsk.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/look")
    public ResultData<Shop> look(@RequestParam(value = "name") String name) {

        return null;//shopService.look(name);
    }


}