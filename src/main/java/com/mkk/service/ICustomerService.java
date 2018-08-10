package com.mkk.service;

import com.mkk.data.dto.CustomerDto;

public interface ICustomerService {
    CustomerDto getCustomerById(Long customerId);
}
