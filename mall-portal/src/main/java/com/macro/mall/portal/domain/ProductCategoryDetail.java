package com.macro.mall.portal.domain;

import java.util.List;

public class ProductCategoryDetail extends ProductCategory {

    public List<ProductCategory>  detailCategoryList;

    public void copy(ProductCategory category){
        this.setIcon(category.getIcon());
        this.setId(category.getId());
        this.setKeywords(category.getKeywords());
        this.setLevel(category.getLevel());
        this.setName(category.getName());
        this.setNavStatus(category.getNavStatus());
        this.setProductCount(category.getProductCount());
        this.setProductUnit(category.getProductUnit());
        this.setShowStatus(category.getShowStatus());
        this.setParentId(category.getParentId());
        this.setSort(category.getSort());
    }
}
