package com.mkk.data.repository;

import com.mkk.data.entity.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface IBasketItemRepository extends JpaRepository<BasketItem, Long> {
    List<Long> findBasketItemsByBasketId(Long basketId);
}
