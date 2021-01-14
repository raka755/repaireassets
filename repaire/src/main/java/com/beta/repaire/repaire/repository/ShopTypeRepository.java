package com.beta.repaire.repaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beta.repaire.repaire.entity.ShopType;

@Repository("shopTypeRepository")
public interface ShopTypeRepository extends JpaRepository<ShopType, Integer> {

}
