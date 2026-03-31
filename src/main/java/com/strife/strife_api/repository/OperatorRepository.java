package com.strife.strife_api.repository;

import com.strife.strife_api.entity.Model;
import com.strife.strife_api.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public interface OperatorRepository extends JpaRepository<Operator, UUID> {
    List<Operator> findByModelSlug(String modelSlug);

    @Transactional
    void deleteByModel(Model model);
}