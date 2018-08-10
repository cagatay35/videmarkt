package com.mkk.rest;

import com.mkk.rest.request.GetBasketItemsRequest;
import com.mkk.rest.response.ControllerResponse;
import com.mkk.service.IBasketService;
import com.mkk.service.request.PutBasketItemRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController(value = "/basket")
public class BasketController {

    @Autowired
    IBasketService basketService;

    @RequestMapping(value = "/put", method = RequestMethod.POST)
    public ResponseEntity<ControllerResponse> putVideoToBasket(@RequestBody PutBasketItemRequest putBasketItemRequest) {
        ControllerResponse controllerResponse = new ControllerResponse();
        try {
            basketService.putBasketItem(putBasketItemRequest);
        } catch (Exception e) {
            log.error("putVideoToBasket", e);
        }

        return new ResponseEntity<ControllerResponse>(controllerResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/getItems", method = RequestMethod.POST)
    public ResponseEntity<ControllerResponse> getItems(@RequestBody GetBasketItemsRequest getBasketItemsRequest) {
        ControllerResponse controllerResponse = new ControllerResponse();
        try {
            //TODO implement getItems for basket items
        } catch (Exception e) {
            log.error("getItems", e);
        }

        return new ResponseEntity<ControllerResponse>(controllerResponse, HttpStatus.OK);
    }

}
