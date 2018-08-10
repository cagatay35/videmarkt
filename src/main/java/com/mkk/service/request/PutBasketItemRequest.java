package com.mkk.service.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class PutBasketItemRequest implements Serializable {

    private Long basketId;

    private Long customerId;

    private Long videoId;

}
