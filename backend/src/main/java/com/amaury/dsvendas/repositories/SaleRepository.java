package com.amaury.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaury.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
