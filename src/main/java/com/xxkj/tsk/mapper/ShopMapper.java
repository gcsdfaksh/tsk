package com.xxkj.tsk.mapper;

import com.xxkj.tsk.entity.Shop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 商品 DAO 接口类
 */

public interface ShopMapper {

    /**
     * 根据商品id，查询商品信息
     */
    @Select("select * from Shop where id = #{id}")
    Shop find(@Param("id") int id);
    /**
     * 创建插入语句
     */
    @Insert("insert into user(schoolid,topimg,name,sex,school,zh,mm) values (#{schoolid},#{topimg},#{name},#{sex},#{school},#{zh},#{mm})")
    int create(Shop user);
}