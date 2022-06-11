package com.github.wouterman.springhateoas.domain;

import com.github.wouterman.springhateoas.domain.model.ProductionOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductionOrders extends CrudRepository<ProductionOrder, Long> {

}
