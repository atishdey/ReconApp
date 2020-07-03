package com.atish.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atish.demo.entity.RecBalanceResult;

@RepositoryRestResource(collectionResourceRel = "recbalanceresult", path = "recbalanceresult")
public interface RecBalanceResultRepository extends CrudRepository<RecBalanceResult, Long>{

}
