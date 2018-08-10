package com.mkk.rest.request;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class GetBasketItemsRequest implements Serializable{
    private Long basketId;
}
