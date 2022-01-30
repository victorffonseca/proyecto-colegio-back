package com.victor.colegio.repository;

import com.victor.colegio.entity.Colegio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColegioRepository extends CrudRepository<Colegio, Long> {
}
