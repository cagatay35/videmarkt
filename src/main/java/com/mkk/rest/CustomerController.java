package com.mkk.rest;

import com.mkk.data.dto.CustomerDto;
import com.mkk.rest.response.ControllerResponse;
import com.mkk.service.ICustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/customer")
@Slf4j
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @RequestMapping(value = "/get/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<ControllerResponse> getCustomer(@PathVariable(name = "customerId") Long customerId) {
        ControllerResponse controllerResponse = new ControllerResponse();
        try {
            CustomerDto customerDto = customerService.getCustomerById(customerId);
            if (customerDto.getId() == null) {
                controllerResponse.setResultCode(-1);
                controllerResponse.setResultDesc("Müşteri Bulunamadı");
            } else {
                controllerResponse.add("customer", customerDto);
            }
        } catch (Exception e) {
            log.error("getCustomer", e);
            controllerResponse.setResultCode(-1);
            controllerResponse.setResultDesc("Müşteri Bulunamadı");
        }


        return new ResponseEntity<ControllerResponse>(controllerResponse, HttpStatus.OK);
    }

}
