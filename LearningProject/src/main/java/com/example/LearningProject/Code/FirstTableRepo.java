package com.example.LearningProject.Code;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface FirstTableRepo extends CrudRepository<FirstTable, Long>, JpaSpecificationExecutor<FirstTable> {
    FirstTable findByName(String name);
}
