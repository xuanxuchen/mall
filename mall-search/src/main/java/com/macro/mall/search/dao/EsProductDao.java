package com.macro.mall.search.dao;

import com.macro.mall.search.domain.EsProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 搜索商品管理自定义Dao
 * Created by macro on 2018/6/19.
 */
@Repository
public interface EsProductDao {
    /**
     * 获取指定ID的搜索商品
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
