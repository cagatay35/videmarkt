package com.mkk.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasketItemDto {

    private Long id;
    private VideoDto videoDto;
    private Long basketId;

}
