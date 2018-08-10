package com.mkk.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "basket_item")
public class BasketItem extends BaseEntity implements Serializable {

    @Column(name = "basket_id")
    private Long basketId;

    @Column(name = "video_id")
    private Long videoId;


}
