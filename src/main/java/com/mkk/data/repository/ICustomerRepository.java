package com.mkk.data.repository;

import com.mkk.data.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
