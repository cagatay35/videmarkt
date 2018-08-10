package com.mkk.service.impl;

import com.mkk.data.dto.CustomerDto;
import com.mkk.data.entity.Customer;
import com.mkk.data.repository.ICustomerRepository;
import com.mkk.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public CustomerDto getCustomerById(Long customerId) {
        Customer customer = customerRepository.getOne(customerId);
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customer, customerDto);
        return customerDto;
    }
}
