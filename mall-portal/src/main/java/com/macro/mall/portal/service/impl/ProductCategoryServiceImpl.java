package com.macro.mall.portal.service.impl;

import com.macro.mall.portal.domain.ProductCategory;
import com.macro.mall.portal.domain.ProductCategoryDetail;
import com.macro.mall.portal.repository.ProductCategoryRepository;
import com.macro.mall.portal.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> getCategoryList(Long parentId) {
        return productCategoryRepository.findByParentId(parentId);
    }

    @Override
    public List<ProductCategoryDetail> getCategoryDetailList(Long cid) {
        List<ProductCategoryDetail> list = new ArrayList<>();

        List<ProductCategory> secondCategoryList =  productCategoryRepository.findByParentId(cid);
        for(ProductCategory category:secondCategoryList){
            ProductCategoryDetail detail = new ProductCategoryDetail();
            List<ProductCategory> detailCategoryList = productCategoryRepository.findByParentId(category.getId());
            detail.detailCategoryList = detailCategoryList;
            detail.copy(category);
            list.add(detail);
        }
        return list;
    }
}
