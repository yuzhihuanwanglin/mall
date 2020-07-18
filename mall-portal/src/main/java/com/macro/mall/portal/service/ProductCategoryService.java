package com.macro.mall.portal.service;
import com.macro.mall.portal.domain.ProductCategory;
import com.macro.mall.portal.domain.ProductCategoryDetail;
import java.util.List;

public interface ProductCategoryService {

    /**
     * 获取商品的分类
     */
    List<ProductCategory> getCategoryList(Long parentId);

    /**
     * 获取商品的二三级详细分类
     *
     * @param cid  一级分类的id
     *
     */
    List<ProductCategoryDetail> getCategoryDetailList(Long cid);
}
