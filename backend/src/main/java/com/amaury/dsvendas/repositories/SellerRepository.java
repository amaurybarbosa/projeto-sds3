package com.amaury.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaury.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
