package com.ian.erp.modules.products.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProductEntity is a Querydsl query type for ProductEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProductEntity extends EntityPathBase<ProductEntity> {

    private static final long serialVersionUID = -658556582L;

    public static final QProductEntity productEntity = new QProductEntity("productEntity");

    public final NumberPath<Long> buyPrice = createNumber("buyPrice", Long.class);

    public final NumberPath<Long> MSRP = createNumber("MSRP", Long.class);

    public final StringPath productCode = createString("productCode");

    public final StringPath productDescription = createString("productDescription");

    public final StringPath productImage = createString("productImage");

    public final StringPath productLine = createString("productLine");

    public final StringPath productName = createString("productName");

    public final StringPath productScale = createString("productScale");

    public final StringPath productVendor = createString("productVendor");

    public final StringPath quantitynStock = createString("quantitynStock");

    public final StringPath ranking = createString("ranking");

    public QProductEntity(String variable) {
        super(ProductEntity.class, forVariable(variable));
    }

    public QProductEntity(Path<? extends ProductEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductEntity(PathMetadata metadata) {
        super(ProductEntity.class, metadata);
    }

}

