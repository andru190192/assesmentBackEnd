/**
 * 
 */
package com.ian.erp.common.generic.repository;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.QBean;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

/**
 * Repositorio generico.
 * 
 * @author Ian 19/01/2019
 *
 */
public class IanGenericRepository<T> extends QuerydslRepositorySupport {

	@Autowired
	@Lazy
	private SessionFactory sessionFactory;

	public IanGenericRepository(Class<?> domainClass) {
		super(domainClass);
	}

	/**
	 * Persistir una entidad.
	 * 
	 * @author Ian 19/01/2018
	 * @param entity entidad
	 */
	public void save(T entity) {
		sessionFactory.getCurrentSession().save(entity);
		sessionFactory.getCurrentSession().flush();
	}

	/**
	 * Actualizar una entidad.
	 * 
	 * @author Ian 19/01/2018
	 * @param entity entidad
	 */
	public void update(T entity) {
		sessionFactory.getCurrentSession().update(entity);
		sessionFactory.getCurrentSession().flush();
	}

	/**
	 * Agregar proyecciones.
	 * 
	 * @author Ian 2/2/2019
	 * @param <U>
	 * @param type  tipo de clase
	 * @param exprs valores
	 */
	protected <U> QBean<U> addProjections(Class<U> type, Expression<?>... exprs) {
		return Projections.bean(type, exprs);
	}

	/**
	 * Agregar restriccion like.
	 * 
	 * @author Ian 3/2/2019
	 * @param where where
	 * @param value valor
	 * @param path  campo aplicar
	 */
	protected void like(BooleanBuilder where, StringPath path, String value) {
		if (isNotEmpty(value)) {
			where.and(path.like(value));
		}
	}

	/**
	 * Agregar restriccion eq.
	 * 
	 * @author Ian 3/2/2019
	 * @param where where
	 * @param value valor
	 * @param path  campo tipo integer aplicar
	 */
	protected void eq(BooleanBuilder where, NumberPath<Integer> path, Integer value) {
		if (value != null) {
			where.and(path.eq(value));
		}
	}

	/**
	 * Obtener todo (select * from entity).
	 * 
	 * @author Ian 3/2/2019
	 * @param entityPath entidad a obtener
	 * @return datos de la entidad
	 */
	public Collection<T> all(EntityPath<T> entity) {
		return from(entity).fetch();
	}

	/**
	 * Crear sql aplicando un where.
	 * 
	 * @author Ian 3/2/2019
	 * @param entityPath entidad a obtener
	 * @param where      filtros aplicar
	 * @param o          orden aplicar
	 * @return datos de la entidad
	 */
	public Collection<T> all(EntityPath<T> entityPath, BooleanBuilder where, OrderSpecifier<?>... o) {
		return from(entityPath).where(where).orderBy(o).fetch();
	}

	/**
	 * Obtener entidad.
	 * 
	 * @author Ian 9/2/2019
	 * @param entityPath entidad a obtener
	 * @param where      restricciones
	 * @return datos de la entidad
	 */
	public T fetchOne(EntityPath<T> entityPath, BooleanBuilder where) {
		return from(entityPath).where(where).fetchOne();
	}
}
