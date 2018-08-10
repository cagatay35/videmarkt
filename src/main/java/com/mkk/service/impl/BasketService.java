package com.mkk.service.impl;

import com.mkk.data.dto.BasketItemDto;
import com.mkk.data.entity.Basket;
import com.mkk.data.entity.BasketItem;
import com.mkk.data.repository.IBasketItemRepository;
import com.mkk.data.repository.IBasketRepository;
import com.mkk.service.IBasketService;
import com.mkk.service.request.PutBasketItemRequest;
import com.mkk.service.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class BasketService implements IBasketService {

    @Autowired
    IBasketItemRepository basketItemRepository;

    @Autowired
    IBasketRepository basketRepository;

    /**
     * Bu metod aracılıgıyla sepete yeni ürün eklenir
     *
     * @param putBasketItemRequest
     * @return
     */
    @Override
    public BaseResponse putBasketItem(PutBasketItemRequest putBasketItemRequest) {
        BaseResponse response = new BaseResponse();
        try {
            if(putBasketItemRequest.getBasketId() == null) {
                // create new basket for customer
                Basket basket =  createBasket(putBasketItemRequest.getCustomerId());
                putBasketItemRequest.setBasketId(basket.getId());
            }

            BasketItem basketItem = new BasketItem();
            basketItem.setVideoId(putBasketItemRequest.getVideoId());
            basketItem.setBasketId(putBasketItemRequest.getBasketId());
            basketItemRepository.save(basketItem);
        } catch (Exception e) {
            log.error("putBasketItem e:", e);
        }
        return response;
    }


    @Override
    public Basket createBasket(Long customerId) {
        Basket basket = new Basket();
        basket.setCustomerId(customerId);
        basket.setStatus("A");
        return basketRepository.save(basket);
    }
}
