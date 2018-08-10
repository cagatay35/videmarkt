package com.mkk.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "basket")
@Getter
@Setter
public class Basket extends BaseEntity implements Serializable {

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "status")
    private String status; // Active , Canceled

}
