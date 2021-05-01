package com.xxkj.tsk.controlller;

import com.xxkj.tsk.entity.Carousel;
import com.xxkj.tsk.service.CarouselService;
import com.xxkj.tsk.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "carousel")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;
    @RequestMapping(value = "/find")
    public ResultData<Carousel> find() {

        return carouselService.find();
    }


}
