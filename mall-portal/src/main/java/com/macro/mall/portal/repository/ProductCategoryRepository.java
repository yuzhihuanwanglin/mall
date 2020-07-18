package com.macro.mall.portal.repository;
import com.macro.mall.portal.domain.ProductCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductCategoryRepository extends MongoRepository<ProductCategory,String> {

    List<ProductCategory> findByParentId(Long cid);
}
