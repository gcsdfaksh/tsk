package com.xxkj.tsk.mapper;

import com.xxkj.tsk.entity.Carousel;
import com.xxkj.tsk.entity.Shop;
import org.apache.ibatis.annotations.Select;

/**
 * 轮播图 DAO 接口类
 */

public interface CarouselMapper {

    /**
     * 查询轮播图信息
     */
    @Select("select * from Carousel")
    Carousel find();
}
