package com.macro.mall.portal.repository;

import com.macro.mall.portal.domain.LaunchConfigInfo;
import com.macro.mall.portal.domain.ProductCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LaunchConfigInfoRepository extends MongoRepository<LaunchConfigInfo,String> {

    @Override
    public List<LaunchConfigInfo> findAll();
}