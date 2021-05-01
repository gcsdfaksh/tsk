package com.xxkj.tsk.service.CarouselServiceImpl;

import com.xxkj.tsk.entity.Carousel;
import com.xxkj.tsk.mapper.CarouselMapper;
import com.xxkj.tsk.service.CarouselService;
import com.xxkj.tsk.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarouselServiceImpl implements CarouselService {
    @Autowired
    CarouselMapper carouselMapper;
    @Override
    public ResultData<Carousel> find() {

        Carousel rep = carouselMapper.find();
        if (rep != null) {
            return new ResultData(rep, 1, "查询成功");
        }
        return new ResultData(null, 0, "查询失败");
    }
}
