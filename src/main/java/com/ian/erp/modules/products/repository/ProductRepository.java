/**
 * 
 */
package com.ian.erp.modules.products.repository;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ian.erp.common.generic.repository.IanGenericRepository;
import com.ian.erp.modules.products.entity.ProductEntity;
import static com.ian.erp.modules.products.entity.QProductEntity.productEntity;

/**
 * @author Ian
 *
 */
@Repository
@Lazy
public class ProductRepository extends IanGenericRepository<ProductEntity> {

	public ProductRepository() {
		super(ProductEntity.class);
	}
	
	public List<ProductEntity> findAll() {
		return from(productEntity).fetch();
	}

}
