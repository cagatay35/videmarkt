package com.mkk.service;

import com.mkk.data.entity.Basket;
import com.mkk.service.request.PutBasketItemRequest;
import com.mkk.service.response.BaseResponse;

public interface IBasketService {
    BaseResponse putBasketItem(PutBasketItemRequest putBasketItemRequest);

    Basket createBasket(Long customerId);
}
