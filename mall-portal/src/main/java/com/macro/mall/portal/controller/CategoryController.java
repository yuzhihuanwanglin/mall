package com.macro.mall.portal.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.portal.domain.ProductCategory;
import com.macro.mall.portal.domain.ProductCategoryDetail;
import com.macro.mall.portal.service.ProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@Api(tags = "CategoryController", description = "商品分类管理")
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @ApiOperation("获取一级分类")
    @RequestMapping(value = "/getCategory/{categoryId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<ProductCategory>> getCategory(@PathVariable Long categoryId) {
        List<ProductCategory> categoryList = productCategoryService.getCategoryList(categoryId);
        return CommonResult.success(categoryList);
    }

    @ApiOperation("获取二三级分类详细")
    @RequestMapping(value = "/getCategoryDetail/{categoryId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<ProductCategoryDetail>> getCategoryDetail(@PathVariable Long categoryId) {
        List<ProductCategoryDetail> categoryList = productCategoryService.getCategoryDetailList(categoryId);
        return CommonResult.success(categoryList);
    }
}
