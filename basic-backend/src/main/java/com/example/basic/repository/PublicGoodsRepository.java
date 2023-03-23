package com.example.basic.repository;

import com.example.basic.entity.PublicGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicGoodsRepository extends JpaRepository<PublicGoods , Long> {
}
