package com.mkk.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "video")
@Entity
@Getter
@Setter
public class Video extends BaseEntity implements Serializable {

    @Column(name = "name")
    private String name;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "produce_date")
    private Date produceDate;
}
