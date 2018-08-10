package com.mkk.data.repository;

import com.mkk.data.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface IBasketRepository extends JpaRepository<Basket, Long> {
    List<Long> findBasketsByCustomerId(Long customerId);
}